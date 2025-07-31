const CourseDetails = ({ courses }) => {
  return (
    <div>
      <h1>Course Details</h1>

      <div>
        {
          courses.map(course => {
            return (
              <div>
                <p>{course.courseName}</p>
                <p>{course.date}</p>
              </div>
            );
          })
        }
      </div>
    </div>
  );
};

export default CourseDetails;
