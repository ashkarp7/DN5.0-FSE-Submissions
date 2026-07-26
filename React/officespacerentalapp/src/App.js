import officeImg from "./images/office.jpg";

function App() {

  const officeList = [
    {
      name: "Tech Park",
      rent: 55000,
      address: "Bangalore"
    },
    {
      name: "Cyber Hub",
      rent: 75000,
      address: "Hyderabad"
    },
    {
      name: "Business Center",
      rent: 62000,
      address: "Chennai"
    }
  ];

  return (
    <div style={{ margin: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src={officeImg}
        alt="Office Space"
        width="500"
        height="300"
      />

      <hr />

      {officeList.map((office, index) => (

        <div key={index} style={{ marginBottom: "20px" }}>

          <h2>{office.name}</h2>

          <h3
            style={{
              color: office.rent < 60000 ? "red" : "green"
            }}
          >
            Rent : ₹{office.rent}
          </h3>

          <h3>Address : {office.address}</h3>

        </div>

      ))}

    </div>
  );
}

export default App;
