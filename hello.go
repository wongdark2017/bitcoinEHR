package main

import "github.com/beego/beego/v2/server/web"

type MainController struct{
	web.Controller
}
func (th *MainController) Get()  {
	th.Ctx.WriteString("Hello world")
}

func main() {
	web.Router("/",&MainController{})
	web.Run()
}