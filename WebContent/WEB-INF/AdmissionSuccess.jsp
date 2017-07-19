<html>
<body>
	<h1>${headerMessage}</h1>
 
	<h3>Congratulations!! the Engineering college has processed your Application form successfully</h3>

	<table>
		<tr>
			<td>Student Name :</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby :</td>
			<td>${student1.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile :</td>
			<td>${student1.studentMobile}</td>
		</tr>

		<tr>
			<td>Student DOB :</td>
			<td>${student1.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills :</td>
			<td>${student1.studentSkills}</td>
		</tr>
		<tr>
			<td>Student Address :
			Street: ${student1.studentAddress.street}
			City: ${student1.studentAddress.city}
			Country: ${student1.studentAddress.country}
			Pincode: ${student1.studentAddress.pincode}</td>
		</tr>

	</table>

</body>
</html>
