<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bootstrap testing</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <style>
        div.container6 {
            position: absolute;
            top: 50%;
            transform: translateY(-50%);
            align-items: center;
            justify-content: center;
            display: flex;
        }
        .empty{
            wight: 50px;
            height: 100px;
        }
        button.btn-primary {
            margin-bottom: 20px;
        }
        .form-floating.mb-3 {
            display: inline-block;
            margin-right: 10px;
            width: calc(33.33% - 10px); /* Ширина формы с учетом отступов */
        }
        .form-floating.mb-3:last-child {
            margin-right: 0;
        }
        .form-select {
            height: 45px;
        }
    </style>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<script src="../static/js/DarkChanger.js"></script>
<div class="container container6">
    <div class="row">
        <div class="empty"></div>
        <form action="/editHuman/lastName/${human.getId()}" method="post" class="form-floating mb-3">
            <input type="text" class="form-control" name="last_name" placeholder="last_name">
            <label for="floatingInput">${human.getLast_name()}</label>
            <button type="submit" class="btn btn-primary">Изменить</button>
        </form>
        <form action="/editHuman/name/${human.getId()}" method="post" class="form-floating mb-3">
            <input type="text" class="form-control" name="name" placeholder="name">
            <label for="floatingInput">${human.getName()}</label>
            <button type="submit" class="btn btn-primary">Изменить</button>
        </form>
        <form action="/editHuman/middleName/${human.getId()}" method="post" class="form-floating mb-3">
            <input type="text" class="form-control" name="middle_name" placeholder="middle_name">
            <label for="floatingInput">${human.getMiddle_name()}</label>
            <button type="submit" class="btn btn-primary">Изменить</button>
        </form>
        <form action="/editHuman/pass/${human.getId()}" method="post" class="form-floating mb-3">
            <input type="text" class="form-control" name="passport_series_and_number" placeholder="passport_series_and_number">
            <label for="floatingInput">${human.getPassport_series_and_number()}</label>
            <button type="submit" class="btn btn-primary">Изменить</button>
        </form>
        <form action="/editHuman/age/${human.getId()}" method="post" class="form-floating mb-3">
            <input type="number" class="form-control" name="age" placeholder="age">
            <label for="floatingInput">${human.getAge()}</label>
            <button type="submit" class="btn btn-primary">Изменить</button>
        </form>
        <form action="/editHuman/citizen/${human.getId()}" method="post" class="form-floating mb-3">
            <label for="citizen_id">Гражданство</label>
            <div class="input-group">
                <select id="citizen_id" required name="citizen_id" class="form-select">
                    <option value="">${human.getCitizen().getCitizenship()}</option>
                    <#if citizens?exists>
                        <#list citizens as citizen>
                            <option value=${citizen.id}>${citizen.getCitizenship()} </option>
                        </#list>
                    </#if>
                </select>
                <button type="submit" class="btn btn-primary">Изменить</button>
            </div>
        </form>
        <form action="/editHuman/address/${human.getId()}" method="post" class="form-floating mb-3">
            <input type="text" class="form-control" name="address" placeholder="address">
            <label for="floatingInput">${human.getCountry().getAddress()}</label>
            <button type="submit" class="btn btn-primary">Изменить</button>
        </form>
        <form action="/editHuman/index/${human.getId()}" method="post" class="form-floating mb-3">
            <input type="text" class="form-control" name="index" placeholder="index">
            <label for="floatingInput">${human.getCountry().getIndex()}</label>
            <button type="submit" class="btn btn-primary">Изменить</button>
        </form>
    </div>
    <a href="/" class="btn btn-primary">Назад</a>

</div>

</body>
</html>
