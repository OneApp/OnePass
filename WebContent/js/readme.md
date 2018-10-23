
# 请遵守以下规范



### 与页面解耦，比如：

```javascript
window.onload=function(){
	var element=docment.getElementById('element').onclick=function(){
		alert("it is working!!!");
	}
}
```
这使得在页面中不用暴露你调用了什么函数。


### 平稳退化，渐进增强

意思是当页面不支持javascript的时候，页面依旧可以正常运行。

而增强就是适配


## 注意，我们主要适配谷歌内核



