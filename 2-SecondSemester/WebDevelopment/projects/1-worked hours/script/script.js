document.querySelector("#continueButton").addEventListener("click", calculate);

let inputFields = document.querySelectorAll("input[type='text']");

function calculate()
{
    let workedHours = Number(document.querySelector("#workedHours").value);
    let hourValue = Number(document.querySelector("#hourValue").value);
    let discount = Number(document.querySelector("#discount").value);
    let bonus = Number(document.querySelector("#bonus").value);

    let validate = Boolean(true);

    inputFields.forEach(function(input)
    {
        if (input.value == "")
        {
            validate = false;

            document.querySelector("#text").innerHTML = "Fill in the fields, would you kindly";
            setTimeout(function() {
                document.querySelector("#text").innerHTML = "";
            }, 4000);
        }

        if (input.value < 0 || isNaN(input.value))
        {
            validate = false;
            document.querySelector("#text").innerHTML = "Put a valid values, would you kindly";
            setTimeout(function() {
                document.querySelector("#text").innerHTML = "";
            }, 4000);
        }
    });

    if (validate == Boolean(true))
    {
        let finalWage = ((workedHours * hourValue) + bonus) - discount;
        document.querySelector("#text").innerHTML = "Your salary is "+finalWage+", but i dont know in what currency";
    }

}
