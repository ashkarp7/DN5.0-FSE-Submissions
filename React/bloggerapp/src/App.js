import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

    return (

        <div style={{ margin: "20px" }}>

            <h1>Blogger App</h1>

            {showBooks && <BookDetails />}

            {showBlogs ? <BlogDetails /> : null}

            {showCourses ? <CourseDetails /> : null}

        </div>

    );

}

export default App;
