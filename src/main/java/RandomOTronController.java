import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

import java.util.ArrayList;
import java.util.HashMap;

public class RandomOTronController {


    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");
        RandomOTron randomOTron = new RandomOTron();

        get("/", (req, res) -> {
           ArrayList<String> result = randomOTron.getNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomOTron", randomOTron);
            model.put("result", result);
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);


        get("/one", (req, res) -> {

            String result = randomOTron.getRandomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomOTron", randomOTron);
            model.put("result", result);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            ArrayList<String> result = randomOTron.getTwoNames();
            String randomName1 = result.get(0);
            String randomName2 = result.get(1);
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomOTron", randomOTron);
            model.put("randomName1", randomName1);
            model.put("randomName2", randomName2);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }

}
