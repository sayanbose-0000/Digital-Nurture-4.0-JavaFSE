const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h1>Blog Details</h1>

      <div>
        {
          blogs.map(blog => {
            return (
              <div>
                <p>{blog.blogName}</p>
                <p>{blog.author}</p>
                <p>{blog.desc}</p>
              </div>
            )
        })
        }
      </div>
    </div>
  );
};

export default BlogDetails;