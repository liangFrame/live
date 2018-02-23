var app=new Vue({
    el : '#app' ,  //绑定元素
    data: {
        firstMessage: '坚持自己的梦想！虽然不知道梦想是什么'
    }
})

var app2=new Vue({
    el: '#app2',
    data: {
        message : '页面加载于'+new Date().toLocaleDateString()
    }
})

var app3=new Vue({
    el: '#app3',
    data:{
        kan: true
    }
})

var app4=new Vue({
    el: "#app4",
    data:{
        studys: [
            { text: "Java"},
            { text: "JavaScript"},
            { text: "深入Java"}
        ]
    }
})

var app5=new Vue({
    el: '#app5',
    data:{
        names:[
            {neirong:"Java"},
            {neirong:"JavaScript"},
            {neirong:"深入Java"}
        ]
    }
})

var app6=new Vue({
    el:"#app6",
    data:{
        message:'Hello Vue.js'
    },
    methods:{
        reverseMessage:function () {
            this.message=this.message.split('').reverse().join('')
        }
    }
})

var app7=new Vue({
    el:'#app7',
    data:{
        message:'Liangzhiyu'
    },
    methods:{
        test:function () {
            this.message=this.message.split('').reverse().join('')
        }
    }
})

var app8=new Vue({
    el:'#app8',
    data:{
        message:'Hello Vue'
    }
});

Vue.component('todo-item', {
    props:['todo'],
    template: '<li>{{ todo.text }}</li>'
})

var app9=new Vue({
    el:"#app9",
    data:{
        groceryList:[
            {id:0,text:'蔬菜'},
            {id:2,text:'奶酪'},
            {id:3,text:"随便吃的"}
        ]
    }
})

new Vue({
    data:{
        a: 1
    },
    created:function () {
        console.log('a is :'+this.a)
    }
})