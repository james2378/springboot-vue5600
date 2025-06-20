const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot88j45/",
            name: "springboot88j45",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot88j45/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "房屋交易系统"
        } 
    }
}
export default base
