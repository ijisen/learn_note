/**
 name：函数节流
 
 description： 
	函数执行一次之后，该函数在指定的时间期限内不再工作，直至过了这段时间才重新生效。
*/

const throttle = (fn, delay) => {
	let timer = null;
	return () => {
		// 函数在执行中，无论触发几次都不执行。
		if(timer) return;
		timer = setTimeout(() => {
			fn();
			clearTimeout(timer);
			timer = null;
		}, delay)
	}
};

/**
 name：函数防抖
 
 description： 
	函数触发后，都重新执行
*/
const debounce = (fn, delay) => {
	let timer = null;
	return () => {
		// 再次触发时，立即重新执行
		if (timer) {
			clearTimeout(timer);
			timer = null;
		}
		timer = setTimeout(fn, delay);
	
	}
}