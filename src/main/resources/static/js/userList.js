webix.ui({
    container: "list-user",
    height: 650,
    cols: [{
        view: "datatable",
        id: "tableUser",
        css: "webix_data_border webix_header_border",
        columns: [{
                id: "id",
                header: "ID",
                sort: "int"
            },
            {
                minWidth: 400,
                id: "email",
                header: "Email",
                sort: "string"
            },
            {
                id: "password",
                header: "Password",
                fillspace: true,
                sort: "string"
            },
        ],
        resizeColumn: true
    }]
});


async function getListUser() {
    console.log("a");
    var res = await axios.get('/users');
    var data = res.data;
    $$("tableUser").parse(data);
}
