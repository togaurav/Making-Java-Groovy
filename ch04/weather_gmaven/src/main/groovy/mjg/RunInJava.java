/* ===================================================
 * Copyright 2012 Kousen IT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ========================================================== */
package mjg;

public class RunInJava {
    public static void main(String[] args) {
        String woeid = "2367105";
        if (args.length > 0) {
            woeid = args[0];
        }
        YahooParser yp = new YahooParser();
        yp.setWoeid(woeid);
        System.out.println(yp.getWeather());
    }
}
