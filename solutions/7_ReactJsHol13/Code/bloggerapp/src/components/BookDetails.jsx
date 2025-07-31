const BookDetails = ({ books }) => {
  return (
    <div>
      <h1>Blog Details</h1>

      <div>
        {
          books.map(book => {
            return (
              <div>
                <p>{book.bookName}</p>
                <p>{book.price}</p>
              </div>
            );
          })
        }
      </div>
    </div >

  );
};

export default BookDetails;
