import React from "react";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
      error: null,
      errorInfo: null,
    };
  }

  loadPosts = async () => {
    try {
      const response = await fetch(
        "https://jsonplaceholder.typicode.com/posts",
      );

      if (!response.ok) {
        throw new Error(`Http error! ${response.status}`);
      }

      const data = await response.json();
      this.setState({ posts: data });
    } catch (error) {
      console.error("Failed to fetch posts:", error);
      this.setState({ hasError: true, error: error });
    }
  };

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }

  componentDidCatch(error, info) {
    alert(`An error occurred: ${error.message}`);
    console.error("Error caught by componentDidCatch:", error, info);
    this.setState({ hasError: true, error: error, errorInfo: info });
  }
}

export default Posts;
