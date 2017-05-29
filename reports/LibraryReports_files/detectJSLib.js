function detectJSLib(url, callback, detected) {
	// If no jquery or existing jquery has low version, load built-in jquery.
	if (!detected && needLoadJquery()) {
		detectJSLib("iv/jquery/jquery.js", function() {
			detectJSLib(url, callback, true);
		}, true);
		return;
	}
	if (typeof (actuate) == 'undefined' || !actuate.report
			|| !actuate.report.HTML5Chart
			|| !actuate.report.HTML5Chart.ClientChart) {
		var script = document.createElement("script")
		script.type = "text/javascript";

		if (script.readyState) { // IE
			script.onreadystatechange = function() {
				if (script.readyState == "loaded"
						|| script.readyState == "complete") {
					script.onreadystatechange = null;
					callback();
				}
			};
		} else { // Others
			script.onload = function() {
				callback();
			};
		}
		script.src = url;
		document.getElementsByTagName("head")[0].appendChild(script);
	} else {
		// If loaded, call directly.
		callback();
	}
}

function needLoadJquery() {
	var needLoad = true;
	if (window.jQuery) {
		var version = jQuery.fn.jquery;
		var verArray = version.split(".");
		// actuate.jquery version is 1.9.1, if customer version is newer, we don't
		// need to load actuate jquery
		if (verArray[1] > 9) {
			needLoad = false;
		}
		// if it is newer , also no need to load
		else if (verArray[1] == 9) {
			if (verArray[2] >= 1) {
				needLoad = false;
			}
		}
	}
	// for other version like 1.4, 1.4.5, 1.0, we need to load
	return needLoad;
}