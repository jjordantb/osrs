package loading;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


/**
 * Loads all of the configuration data from jav_config.ws
 *
 * @author Parametric
 */
public class ConfigLoader {

    private final Configs configs = new Configs();

    public void load(int world) {
        this.configs.clear();
        try {
            HttpResponse<String> response = Unirest.get("http://oldschool" + world + ".runescape.com/jav_config.ws")
                    .asString();

            String res = response.getBody().replace("param=", "").replace("msg=" , "");
            String[] results = res.split("\n");
            for (String result : results) {
                if (result.length() > 0) {
                    int idx = result.indexOf("=");
                    this.configs.put(result.substring(0, idx), result.substring(idx + 1));
                }
            }
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

    public Configs getConfigs() {
        return configs;
    }

}
