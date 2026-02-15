function showdoctors(){
    fetch("http://localhost:8080/doctors")
    .then(response => response.json())
    .then((data) => {
               const doctorList = document.getElementById("doctorstable");

               data.forEach(doctor => {
                var row=`<tr>
                <td>${doctor.doctorid}</td>
                 <td>${doctor.doctorname}</td>
                  <td>${doctor.specialization}</td>
                   <td>${doctor.availableStime}</td>
                    <td>${doctor.roomno}</td>
                   
                </tr>`
                doctorList.innerHTML += row;

               });
    }
        );
}