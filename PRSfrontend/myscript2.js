function showpatients(){
    fetch("http://localhost:8080/doctors/enrolled")
    .then(response => response.json())
    .then((data) => {
               const PatientList = document.getElementById("patientstable");

               data.forEach(doc => {
                var row=`<tr>
                <td>${doc.id}</td>
                 <td>${doc.name}</td>
                  <td>${doc.age}</td>
                   <td>${doc.gender}</td>
                   <td>${doc.contactno}</td>
                    <td>${doc.address}</td>
                     <td>${doc.symptoms}</td>
                   
                </tr>`
                PatientList.innerHTML += row;

               });
    }
        );
}