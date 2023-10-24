
function checkFlight() {
    if(data.flightNumber != null){
        if(data.departureTime < new Date.now){
          fetch("/flight/37")
  .then((response) => {
    if (!response.ok) {
      throw new Error("HTTP Hatası: " + response.status);
    }
    return response.json();
  })
  .then((data) => {
    checkFlight();
    console.log("Uçuş Detayları:", data);
  })
  .catch((error) => {
    console.error("Hata:", error);
  });

            data.status == "Scheduled"
            
        }
        if (data.departureTime >= new Date.now){
            data.status == "Departed"
            alert("Departed")
        }
        if(data.arrivalTime >= new Date.now){
            data.status == "Arrived"
            alert("Arrived")
        }
    }
    const price = data.price;

}

function createFlight() {
  fetch("/flight", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(newFlight),
  })
    .then((response) => {
      if (!response.ok) {
        throw new Error("HTTP Hatası: " + response.status);
      }
      return response.json();
    })
    .then((data) => {
      createFlight();
      console.log("Yeni Uçuş Oluşturuldu:", data);
    })
    .catch((error) => {
      console.error("Hata:", error);
    });
  
    data.flightNumber = document.getElementById("flightNumber").value
    document.getElementById("departureTime").value = data.departureTime
    document.getElementById("arrivalTime").value = data.arrivalTime
    document.getElementById("price").value  = data.price

}

// Create Flight düğmesini dinleyen bir olay dinleyici ekleyin
const createFlightButton = document.getElementById("createFlightButton");
createFlightButton.addEventListener("click", createFlight);
