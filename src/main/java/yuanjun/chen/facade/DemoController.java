/**
 * @Title: DemoController.java
 * @Package: yuanjun.chen.facade
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: 陈元俊
 * @date: 2018年8月7日 下午5:23:31
 * @version V1.0
 * @Copyright: 2018 All rights reserved.
 */
package yuanjun.chen.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @Description: Controller类
 * @author: 陈元俊
 * @date: 2018年8月7日 下午5:23:31
 */
@RestController
public class DemoController {
    private static final Logger logger = LogManager.getLogger(DemoController.class);

    @RequestMapping(value = "/zz", method = RequestMethod.GET)
    public ResponseEntity<String> hellozz() {
        return ResponseEntity.badRequest().body("haha");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

}
