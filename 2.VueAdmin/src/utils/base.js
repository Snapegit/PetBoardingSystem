const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0182ym1k/",
            name: "springboot0182ym1k",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0182ym1k/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于spring boot框架+vue的宠物寄养系统"
        } 
    }
}
export default base
