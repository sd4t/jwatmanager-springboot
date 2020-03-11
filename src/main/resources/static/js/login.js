async function login() {
    var data = $("form").serializeArray();
    console.log(data[1].value);

    axios.post('/login', {
        email: data[0].value,
        password: data[1].value
    })
        .then(function (response) {
            console.log(response);
        })
        .catch(function (error) {
            console.log(error);
        });
}