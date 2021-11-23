let express = require('express'); 
let app = express();  

app.get("/", function (req, res) {
	res.send("Hello!")
})

app.get('/index.html', function (req, res) {  
	res.sendFile( __dirname + "/" + "index.html" );  
}) 
 
app.get('/eligibility', function (req, res) {
	let name = req.query.name
	let age = parseInt(req.query.age)
	
	if (age >= 18)
		res.send("Hello " + name + ". Congrats! You are eligible to vote!!");
	else
		res.send("Hello " + name + ". Sorry! you are ineligible to vote!!");
})
  
let server = app.listen(8080, function () {  
  let host = server.address().address  
  let port = server.address().port  

  console.log(`Example app listening at http://${host}:${port}`)  
})  
