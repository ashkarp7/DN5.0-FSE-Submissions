function BookDetails() {

    const books = [
        {
            id: 1,
            name: "React Basics",
            author: "Jordan Walke"
        },
        {
            id: 2,
            name: "JavaScript",
            author: "Brendan Eich"
        },
        {
            id: 3,
            name: "Learning React",
            author: "Alex Banks"
        }
    ];

    return (

        <div>

            <h2>Book Details</h2>

            <ul>

                {books.map(book => (

                    <li key={book.id}>
                        {book.name} - {book.author}
                    </li>

                ))}

            </ul>

        </div>

    );

}

export default BookDetails;
