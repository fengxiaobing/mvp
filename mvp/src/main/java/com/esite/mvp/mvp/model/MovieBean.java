package com.esite.mvp.mvp.model;/**
 * Created by RF
 * on 2017/6/30.
 */

import java.io.Serializable;
import java.util.List;

/**
 * Created by RF
 * on 2017/6/30.
 */
public class MovieBean implements Serializable {
    private static final long serialVersionUID = 6753210234564872868L;



        /**
         * city_id : CHBJ000600
         * city_name : 昌平
         * future : [{"code1":"4","code2":"1","cop":"","date":"2017-07-02","day":"周日","high":"36","low":"24","text":"多云/晴","wind":"风力2级"},{"code1":"4","code2":"11","cop":"","date":"2017-07-03","day":"周一","high":"36","low":"24","text":"多云/雷阵雨","wind":"风力2级"},{"code1":"11","code2":"10","cop":"","date":"2017-07-04","day":"周二","high":"32","low":"23","text":"雷阵雨/阵雨","wind":"风力2级"},{"code1":"10","code2":"9","cop":"","date":"2017-07-05","day":"周三","high":"31","low":"24","text":"阵雨/阴","wind":"风力2级"},{"code1":"9","code2":"9","cop":"","date":"2017-07-06","day":"周四","high":"31","low":"24","text":"阴/阴","wind":"风力2级"},{"code1":"9","code2":"14","cop":"","date":"2017-07-07","day":"周五","high":"30","low":"24","text":"阴/中雨","wind":"风力2级"},{"code1":"13","code2":"9","cop":"","date":"2017-07-08","day":"周六","high":"29","low":"24","text":"小雨/阴","wind":"风力2级"},{"code1":"9","code2":"13","cop":"","date":"2017-07-09","day":"周日","high":"34","low":"24","text":"阴/小雨","wind":"风力2级"},{"code1":"9","code2":"4","cop":"","date":"2017-07-10","day":"周一","high":"34","low":"24","text":"阴/多云","wind":"风力2级"},{"code1":"4","code2":"13","cop":"","date":"2017-07-11","day":"周二","high":"31","low":"22","text":"多云/小雨","wind":"风力2级"}]
         * last_update : 2017-07-02T12:50:00+08:00
         * now : {"air_quality":{"city":{"aqi":"140","co":"1.255","last_update":"2017-07-02T11:00:00+08:00","no2":"37","o3":"149","pm10":"120","pm25":"107","quality":"轻度污染","so2":"11"}},"alarms":[],"code":"4","feels_like":"31","humidity":"55","pressure":"993","pressure_rising":"未知","temperature":"32","text":"多云","visibility":"6.90","wind_direction":"东南","wind_scale":"2","wind_speed":"6.84"}
         * today : {"suggestion":{"car_washing":{"brief":"较适宜","details":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"dressing":{"brief":"炎热","details":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"},"flu":{"brief":"少发","details":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},"sport":{"brief":"较适宜","details":"天气较好，户外运动请注意防晒。推荐您进行室内运动。"},"travel":{"brief":"一般","details":"天气较好，同时有微风相伴，但温度较高，天气热，请尽量避免高温时段外出，若外出请注意防暑降温和防晒。"},"uv":{"brief":"中等","details":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}},"sunrise":"04:50 AM","sunset":"07:49 PM"}
         */

        private String city_id;
        private String city_name;
        private String last_update;
        private NowBean now;
        private TodayBean today;
        private List<FutureBean> future;

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getLast_update() {
            return last_update;
        }

        public void setLast_update(String last_update) {
            this.last_update = last_update;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public List<FutureBean> getFuture() {
            return future;
        }

        public void setFuture(List<FutureBean> future) {
            this.future = future;
        }

        public static class NowBean  implements Serializable {
            /**
             * air_quality : {"city":{"aqi":"140","co":"1.255","last_update":"2017-07-02T11:00:00+08:00","no2":"37","o3":"149","pm10":"120","pm25":"107","quality":"轻度污染","so2":"11"}}
             * alarms : []
             * code : 4
             * feels_like : 31
             * humidity : 55
             * pressure : 993
             * pressure_rising : 未知
             * temperature : 32
             * text : 多云
             * visibility : 6.90
             * wind_direction : 东南
             * wind_scale : 2
             * wind_speed : 6.84
             */

            private AirQualityBean air_quality;
            private String code;
            private String feels_like;
            private String humidity;
            private String pressure;
            private String pressure_rising;
            private String temperature;
            private String text;
            private String visibility;
            private String wind_direction;
            private String wind_scale;
            private String wind_speed;
            private List<?> alarms;

            public AirQualityBean getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityBean air_quality) {
                this.air_quality = air_quality;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getFeels_like() {
                return feels_like;
            }

            public void setFeels_like(String feels_like) {
                this.feels_like = feels_like;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getPressure_rising() {
                return pressure_rising;
            }

            public void setPressure_rising(String pressure_rising) {
                this.pressure_rising = pressure_rising;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getVisibility() {
                return visibility;
            }

            public void setVisibility(String visibility) {
                this.visibility = visibility;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_scale() {
                return wind_scale;
            }

            public void setWind_scale(String wind_scale) {
                this.wind_scale = wind_scale;
            }

            public String getWind_speed() {
                return wind_speed;
            }

            public void setWind_speed(String wind_speed) {
                this.wind_speed = wind_speed;
            }

            public List<?> getAlarms() {
                return alarms;
            }

            public void setAlarms(List<?> alarms) {
                this.alarms = alarms;
            }

            public static class AirQualityBean  implements Serializable {
                /**
                 * city : {"aqi":"140","co":"1.255","last_update":"2017-07-02T11:00:00+08:00","no2":"37","o3":"149","pm10":"120","pm25":"107","quality":"轻度污染","so2":"11"}
                 */

                private CityBean city;

                public CityBean getCity() {
                    return city;
                }

                public void setCity(CityBean city) {
                    this.city = city;
                }

                public static class CityBean  implements Serializable {
                    /**
                     * aqi : 140
                     * co : 1.255
                     * last_update : 2017-07-02T11:00:00+08:00
                     * no2 : 37
                     * o3 : 149
                     * pm10 : 120
                     * pm25 : 107
                     * quality : 轻度污染
                     * so2 : 11
                     */

                    private String aqi;
                    private String co;
                    private String last_update;
                    private String no2;
                    private String o3;
                    private String pm10;
                    private String pm25;
                    private String quality;
                    private String so2;

                    public String getAqi() {
                        return aqi;
                    }

                    public void setAqi(String aqi) {
                        this.aqi = aqi;
                    }

                    public String getCo() {
                        return co;
                    }

                    public void setCo(String co) {
                        this.co = co;
                    }

                    public String getLast_update() {
                        return last_update;
                    }

                    public void setLast_update(String last_update) {
                        this.last_update = last_update;
                    }

                    public String getNo2() {
                        return no2;
                    }

                    public void setNo2(String no2) {
                        this.no2 = no2;
                    }

                    public String getO3() {
                        return o3;
                    }

                    public void setO3(String o3) {
                        this.o3 = o3;
                    }

                    public String getPm10() {
                        return pm10;
                    }

                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }

                    public String getPm25() {
                        return pm25;
                    }

                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }

                    public String getQuality() {
                        return quality;
                    }

                    public void setQuality(String quality) {
                        this.quality = quality;
                    }

                    public String getSo2() {
                        return so2;
                    }

                    public void setSo2(String so2) {
                        this.so2 = so2;
                    }
                }
            }
        }

        public static class TodayBean  implements Serializable {
            /**
             * suggestion : {"car_washing":{"brief":"较适宜","details":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"dressing":{"brief":"炎热","details":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"},"flu":{"brief":"少发","details":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"},"sport":{"brief":"较适宜","details":"天气较好，户外运动请注意防晒。推荐您进行室内运动。"},"travel":{"brief":"一般","details":"天气较好，同时有微风相伴，但温度较高，天气热，请尽量避免高温时段外出，若外出请注意防暑降温和防晒。"},"uv":{"brief":"中等","details":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}}
             * sunrise : 04:50 AM
             * sunset : 07:49 PM
             */

            private SuggestionBean suggestion;
            private String sunrise;
            private String sunset;

            public SuggestionBean getSuggestion() {
                return suggestion;
            }

            public void setSuggestion(SuggestionBean suggestion) {
                this.suggestion = suggestion;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public static class SuggestionBean  implements Serializable {
                /**
                 * car_washing : {"brief":"较适宜","details":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}
                 * dressing : {"brief":"炎热","details":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"}
                 * flu : {"brief":"少发","details":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"}
                 * sport : {"brief":"较适宜","details":"天气较好，户外运动请注意防晒。推荐您进行室内运动。"}
                 * travel : {"brief":"一般","details":"天气较好，同时有微风相伴，但温度较高，天气热，请尽量避免高温时段外出，若外出请注意防暑降温和防晒。"}
                 * uv : {"brief":"中等","details":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"}
                 */

                private CarWashingBean car_washing;
                private DressingBean dressing;
                private FluBean flu;
                private SportBean sport;
                private TravelBean travel;
                private UvBean uv;

                public CarWashingBean getCar_washing() {
                    return car_washing;
                }

                public void setCar_washing(CarWashingBean car_washing) {
                    this.car_washing = car_washing;
                }

                public DressingBean getDressing() {
                    return dressing;
                }

                public void setDressing(DressingBean dressing) {
                    this.dressing = dressing;
                }

                public FluBean getFlu() {
                    return flu;
                }

                public void setFlu(FluBean flu) {
                    this.flu = flu;
                }

                public SportBean getSport() {
                    return sport;
                }

                public void setSport(SportBean sport) {
                    this.sport = sport;
                }

                public TravelBean getTravel() {
                    return travel;
                }

                public void setTravel(TravelBean travel) {
                    this.travel = travel;
                }

                public UvBean getUv() {
                    return uv;
                }

                public void setUv(UvBean uv) {
                    this.uv = uv;
                }

                public static class CarWashingBean  implements Serializable {
                    /**
                     * brief : 较适宜
                     * details : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
                     */

                    private String brief;
                    private String details;

                    public String getBrief() {
                        return brief;
                    }

                    public void setBrief(String brief) {
                        this.brief = brief;
                    }

                    public String getDetails() {
                        return details;
                    }

                    public void setDetails(String details) {
                        this.details = details;
                    }
                }

                public static class DressingBean  implements Serializable {
                    /**
                     * brief : 炎热
                     * details : 天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。
                     */

                    private String brief;
                    private String details;

                    public String getBrief() {
                        return brief;
                    }

                    public void setBrief(String brief) {
                        this.brief = brief;
                    }

                    public String getDetails() {
                        return details;
                    }

                    public void setDetails(String details) {
                        this.details = details;
                    }
                }

                public static class FluBean  implements Serializable {
                    /**
                     * brief : 少发
                     * details : 各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。
                     */

                    private String brief;
                    private String details;

                    public String getBrief() {
                        return brief;
                    }

                    public void setBrief(String brief) {
                        this.brief = brief;
                    }

                    public String getDetails() {
                        return details;
                    }

                    public void setDetails(String details) {
                        this.details = details;
                    }
                }

                public static class SportBean  implements Serializable {
                    /**
                     * brief : 较适宜
                     * details : 天气较好，户外运动请注意防晒。推荐您进行室内运动。
                     */

                    private String brief;
                    private String details;

                    public String getBrief() {
                        return brief;
                    }

                    public void setBrief(String brief) {
                        this.brief = brief;
                    }

                    public String getDetails() {
                        return details;
                    }

                    public void setDetails(String details) {
                        this.details = details;
                    }
                }

                public static class TravelBean  implements Serializable {
                    /**
                     * brief : 一般
                     * details : 天气较好，同时有微风相伴，但温度较高，天气热，请尽量避免高温时段外出，若外出请注意防暑降温和防晒。
                     */

                    private String brief;
                    private String details;

                    public String getBrief() {
                        return brief;
                    }

                    public void setBrief(String brief) {
                        this.brief = brief;
                    }

                    public String getDetails() {
                        return details;
                    }

                    public void setDetails(String details) {
                        this.details = details;
                    }
                }

                public static class UvBean  implements Serializable {
                    /**
                     * brief : 中等
                     * details : 属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。
                     */

                    private String brief;
                    private String details;

                    public String getBrief() {
                        return brief;
                    }

                    public void setBrief(String brief) {
                        this.brief = brief;
                    }

                    public String getDetails() {
                        return details;
                    }

                    public void setDetails(String details) {
                        this.details = details;
                    }
                }
            }
        }

        public static class FutureBean  implements Serializable {
            /**
             * code1 : 4
             * code2 : 1
             * cop :
             * date : 2017-07-02
             * day : 周日
             * high : 36
             * low : 24
             * text : 多云/晴
             * wind : 风力2级
             */

            private String code1;
            private String code2;
            private String cop;
            private String date;
            private String day;
            private String high;
            private String low;
            private String text;
            private String wind;

            public String getCode1() {
                return code1;
            }

            public void setCode1(String code1) {
                this.code1 = code1;
            }

            public String getCode2() {
                return code2;
            }

            public void setCode2(String code2) {
                this.code2 = code2;
            }

            public String getCop() {
                return cop;
            }

            public void setCop(String cop) {
                this.cop = cop;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDay() {
                return day;
            }

            public void setDay(String day) {
                this.day = day;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }
        }
    }
