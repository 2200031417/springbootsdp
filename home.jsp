<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home - Student Activities Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }
        header {
            background-color: #007BFF;
            color: white;
            padding: 10px 20px;
        }
        header h1 {
            margin: 0;
        }
        nav {
            background-color: #0056b3;
            overflow: hidden;
            padding: 10px 0;
        }
        nav a {
            text-decoration: none;
            color: white;
            padding: 10px 20px;
            display: inline-block;
            font-size: 16px;
        }
        nav a:hover {
            background-color: #007BFF;
        }
        .container {
            padding: 20px;
            text-align: center;
        }
        .container a {
            text-decoration: none;
            color: #007BFF;
            padding: 10px 20px;
            border: 1px solid #007BFF;
            border-radius: 5px;
            margin: 5px;
            display: inline-block;
            transition: all 0.3s ease-in-out;
        }
        .container a:hover {
            background-color: #007BFF;
            color: white;
        }
    </style>
</head>
<body>
    <header>
        <h1>Student Activities Management System</h1>
    </header>
    <nav>
        <a href="/home">Home</a>
        <a href="/login">Login</a>
        <a href="/signup">Signup</a>
        <a href="/contact">Contact Us</a>
    </nav>
    <div class="container">
        <h2>Welcome to Student Activities Management System</h2>
        <a href="/events">View Events</a>
        <a href="/events/add">Add Event</a>
    </div>
</body>
</html>
