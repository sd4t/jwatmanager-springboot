async function login() {
    // var data = $("form").serializeArray();

    axios.post('/login', {
        // email: data[0].value,
        // password: data[1].value,
        email: document.getElementById("email").value,
        password: document.getElementById("password").value

    })
        .then(function (response) {
            console.log(response);
        })
        .catch(function (error) {
            console.log(error);
        });
}