<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>Book MVC Project</title>
</head>
<body>
    <form action="/book" method="GET">

        <h1>Book Details</h1>
        Book Id :  <input type="text" name="ids" value="" placeholder="Enter the Id"/>
        <input type="submit" name="" value="Search"/>
        <hr>

        Book Id: ${bookObj.bookId}
        <br/>
        Book Name: ${bookObj.bookName}
        <br/>
        Book Price:${bookObj.bookPrice}
        


    </form>
    
</body>
</html>