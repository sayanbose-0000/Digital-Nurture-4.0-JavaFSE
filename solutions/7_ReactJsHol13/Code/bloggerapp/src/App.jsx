import BlogDetails from "./components/BlogDetails";
import BookDetails from "./components/BookDetails";
import CourseDetails from "./components/CourseDetails";

const App = () => {
  const courses = [
    {
      courseName: "React",
      date: "04/05/2025"
    },
    {
      courseName: "Angular",
      date: "06/03/2022"
    }
  ];

  const books = [
    {
      bookName: "Master React",
      price: 670
    },
    {
      bookName: "Deep Dive into Angular 11",
      price: 800
    },
    {
      bookName: "Mongo Essentials",
      price: 450
    }
  ];

  const blogs = [
    {
      blogName: "React Learning",
      author: "Stephen Biz",
      desc: "Welcome to learning React!"
    },
    {
      blogName: "Installation",
      author: "Schewzdenier",
      desc: "You can install react from npm"
    }
  ];

  return (
    <main style={{ display: "flex", gap: "50px" }}>
      <CourseDetails courses={courses} />
      <BookDetails books={books} />
      <BlogDetails blogs={blogs} />
    </main>
  );
};

export default App;