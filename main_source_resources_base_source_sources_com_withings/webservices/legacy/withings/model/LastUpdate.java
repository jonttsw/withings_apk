package com.withings.webservices.legacy.withings.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.DateTimeSerializer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.joda.time.DateTime;
import x70.b;
@Deprecated
/* loaded from: classes4.dex */
public class LastUpdate {
    private static final String VASISTAS_BED_NAME = "32";
    private static final String VASISTAS_MOTION_NAME = "16";
    private DateTime account;
    private Map<Long, Device> devices;
    private Map<Long, User> users;

    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<LastUpdate> {
        private DateTimeSerializer dateTimeSerializer = new DateTimeSerializer();

        private DateTime deserializeAccount(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            JsonElement jsonElement = jsonObject.get(ConstantsWs.JSON_ACCOUNT_KEY_ACCOUNTS);
            if (jsonElement != null && jsonElement.isJsonArray()) {
                JsonArray jsonArray = (JsonArray) jsonElement;
                if (jsonArray.size() != 0) {
                    JsonElement jsonElement2 = jsonArray.get(0);
                    if (!jsonElement2.isJsonObject()) {
                        return null;
                    }
                    return deserializeDateTime(jsonElement2.getAsJsonObject().get("modified"), jsonDeserializationContext);
                }
            }
            return null;
        }

        private Map<String, DateTime> deserializeActivityTimes(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return deserializeList(jsonObject, jsonDeserializationContext, "activity");
        }

        private DateTime deserializeDateTime(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
            if (jsonElement != null) {
                return this.dateTimeSerializer.deserialize(jsonElement, (Type) DateTime.class, jsonDeserializationContext);
            }
            return null;
        }

        private Device deserializeDevice(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            Device device = new Device();
            device.setDeviceId(jsonObject.get("id").getAsLong());
            DateTime deserializeDateTime = deserializeDateTime(jsonObject.get("modified"), jsonDeserializationContext);
            if (deserializeDateTime != null) {
                device.setModified(deserializeDateTime);
            }
            device.setActivity(deserializeActivityTimes(jsonObject, jsonDeserializationContext));
            device.setMeasuresHf(deserializeHFMeasures(jsonObject, jsonDeserializationContext));
            return device;
        }

        private Map<Long, Device> deserializeDevices(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            HashMap hashMap = new HashMap();
            JsonArray asJsonArray = jsonObject.getAsJsonArray("devices");
            if (asJsonArray == null) {
                return hashMap;
            }
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                Device deserializeDevice = deserializeDevice(it.next().getAsJsonObject(), jsonDeserializationContext);
                hashMap.put(Long.valueOf(deserializeDevice.getDeviceId()), deserializeDevice);
            }
            return hashMap;
        }

        private Map<String, DateTime> deserializeHFMeasures(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return deserializeList(jsonObject, jsonDeserializationContext, ConstantsWs.SYNC_PROCESS_MEASURE_HF);
        }

        private Map<String, DateTime> deserializeList(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, String str) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                String key = entry.getKey();
                int indexOf = key.indexOf("_");
                if (indexOf >= 0 && key.substring(0, indexOf).equalsIgnoreCase(str)) {
                    String substring = key.substring(indexOf + 1);
                    try {
                        DateTime deserializeDateTime = deserializeDateTime(entry.getValue(), jsonDeserializationContext);
                        if (deserializeDateTime != null) {
                            hashMap.put(substring, deserializeDateTime);
                        }
                    } catch (JsonParseException e11) {
                        b.p(e11);
                    }
                }
            }
            return hashMap;
        }

        private User deserializeUser(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            User user = new User();
            user.setUserId(jsonObject.get("id").getAsLong());
            DateTime deserializeDateTime = deserializeDateTime(jsonObject.get("modified"), jsonDeserializationContext);
            if (deserializeDateTime != null) {
                user.setModified(deserializeDateTime);
            }
            DateTime deserializeDateTime2 = deserializeDateTime(jsonObject.get("aggregate"), jsonDeserializationContext);
            if (deserializeDateTime2 != null) {
                user.setAggregate(deserializeDateTime2);
            }
            DateTime deserializeDateTime3 = deserializeDateTime(jsonObject.get("measure"), jsonDeserializationContext);
            if (deserializeDateTime3 != null) {
                user.setMeasure(deserializeDateTime3);
            }
            DateTime deserializeDateTime4 = deserializeDateTime(jsonObject.get("classifier"), jsonDeserializationContext);
            if (deserializeDateTime4 != null) {
                user.setClassifier(deserializeDateTime4);
            }
            DateTime deserializeDateTime5 = deserializeDateTime(jsonObject.get("target"), jsonDeserializationContext);
            if (deserializeDateTime5 != null) {
                user.setTarget(deserializeDateTime5);
            }
            DateTime deserializeDateTime6 = deserializeDateTime(jsonObject.get("notegrp"), jsonDeserializationContext);
            if (deserializeDateTime6 != null) {
                user.setNoteGroup(deserializeDateTime6);
            }
            DateTime deserializeDateTime7 = deserializeDateTime(jsonObject.get("insight_thermo"), jsonDeserializationContext);
            if (deserializeDateTime7 != null) {
                user.setThermoInsight(deserializeDateTime7);
            }
            DateTime deserializeDateTime8 = deserializeDateTime(jsonObject.get("healthattribute"), jsonDeserializationContext);
            if (deserializeDateTime8 != null) {
                user.setHealthAttribute(deserializeDateTime8);
            }
            DateTime deserializeDateTime9 = deserializeDateTime(jsonObject.get("hair_care"), jsonDeserializationContext);
            if (deserializeDateTime9 != null) {
                user.setHairCare(deserializeDateTime9);
            }
            DateTime deserializeDateTime10 = deserializeDateTime(jsonObject.get(ConstantsWs.SYNC_PROCESS_ROUTINE), jsonDeserializationContext);
            if (deserializeDateTime10 != null) {
                user.setRoutine(deserializeDateTime10);
            }
            user.setVasistas(deserializeVasistasTimes(jsonObject, jsonDeserializationContext));
            user.setActivity(deserializeActivityTimes(jsonObject, jsonDeserializationContext));
            return user;
        }

        private Map<Long, User> deserializeUsers(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            HashMap hashMap = new HashMap();
            if (jsonObject.getAsJsonArray("users") == null) {
                return hashMap;
            }
            Iterator<JsonElement> it = jsonObject.getAsJsonArray("users").iterator();
            while (it.hasNext()) {
                User deserializeUser = deserializeUser(it.next().getAsJsonObject(), jsonDeserializationContext);
                hashMap.put(Long.valueOf(deserializeUser.getUserId()), deserializeUser);
            }
            return hashMap;
        }

        private Map<String, DateTime> deserializeVasistasTimes(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return deserializeList(jsonObject, jsonDeserializationContext, com.withings.vasistas.ws.WsVasistasSerie.KEY_VASISTAS);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public LastUpdate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            return new LastUpdate(deserializeAccount(asJsonObject, jsonDeserializationContext), deserializeUsers(asJsonObject, jsonDeserializationContext), deserializeDevices(asJsonObject, jsonDeserializationContext), 0);
        }
    }

    /* loaded from: classes4.dex */
    public static class Device {
        private long deviceId;
        private DateTime modified = new DateTime(0);
        private Map<String, DateTime> measuresHf = new HashMap();
        private Map<String, DateTime> activity = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivity(Map<String, DateTime> map) {
            this.activity = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(long j5) {
            this.deviceId = j5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeasuresHf(Map<String, DateTime> map) {
            this.measuresHf = map;
        }

        public DateTime getActivityForDeviceType(int i11) {
            DateTime dateTime = this.activity.get(String.valueOf(i11));
            if (dateTime == null) {
                return new DateTime(0L);
            }
            return dateTime;
        }

        public long getDeviceId() {
            return this.deviceId;
        }

        public DateTime getMeasuresHfForMeasureType(int i11) {
            DateTime dateTime = this.measuresHf.get(String.valueOf(i11));
            if (dateTime == null) {
                return new DateTime(0L);
            }
            return dateTime;
        }

        public DateTime getModified() {
            return this.modified;
        }

        public void setModified(DateTime dateTime) {
            this.modified = dateTime;
        }
    }

    /* loaded from: classes4.dex */
    public static class User {
        private long userId;
        private DateTime modified = new DateTime(0);
        private Map<String, DateTime> vasistas = new HashMap();
        private Map<String, DateTime> activity = new HashMap();
        private DateTime aggregate = new DateTime(0);
        private DateTime measure = new DateTime(0);
        private DateTime classifier = new DateTime(0);
        private DateTime target = new DateTime(0);
        private DateTime noteGroup = new DateTime(0);
        private DateTime thermoInsight = new DateTime(0);
        private DateTime healthAttribute = new DateTime(0);
        private DateTime hairCare = new DateTime(0);
        private DateTime routine = new DateTime(0);

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivity(Map<String, DateTime> map) {
            this.activity = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregate(DateTime dateTime) {
            this.aggregate = dateTime;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeasure(DateTime dateTime) {
            this.measure = dateTime;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(long j5) {
            this.userId = j5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVasistas(Map<String, DateTime> map) {
            this.vasistas = map;
        }

        public DateTime getActivityForDeviceType(int i11) {
            DateTime dateTime = this.activity.get(String.valueOf(i11));
            if (dateTime == null) {
                return new DateTime(0L);
            }
            return dateTime;
        }

        public DateTime getAggregate() {
            return this.aggregate;
        }

        public DateTime getClassifier() {
            return this.classifier;
        }

        public DateTime getHairCare() {
            return this.hairCare;
        }

        public DateTime getHealthAttribute() {
            return this.healthAttribute;
        }

        public DateTime getMeasure() {
            return this.measure;
        }

        public DateTime getModified() {
            return this.modified;
        }

        public DateTime getNoteGroup() {
            return this.noteGroup;
        }

        public DateTime getRoutine() {
            return this.routine;
        }

        public DateTime getTarget() {
            return this.target;
        }

        public DateTime getThermoInsight() {
            return this.thermoInsight;
        }

        public long getUserId() {
            return this.userId;
        }

        public DateTime getVasistasForCategory(String str) {
            if (ConstantsWs.VASISTAS_CATEGORY_BED.equalsIgnoreCase(str)) {
                str = LastUpdate.VASISTAS_BED_NAME;
            } else if (ConstantsWs.VASISTAS_CATEGORY_TRACKER.equalsIgnoreCase(str)) {
                str = LastUpdate.VASISTAS_MOTION_NAME;
            }
            DateTime dateTime = this.vasistas.get(str);
            if (dateTime == null) {
                return new DateTime(0L);
            }
            return dateTime;
        }

        public void setClassifier(DateTime dateTime) {
            this.classifier = dateTime;
        }

        public void setHairCare(DateTime dateTime) {
            this.hairCare = dateTime;
        }

        public void setHealthAttribute(DateTime dateTime) {
            this.healthAttribute = dateTime;
        }

        public void setModified(DateTime dateTime) {
            this.modified = dateTime;
        }

        public void setNoteGroup(DateTime dateTime) {
            this.noteGroup = dateTime;
        }

        public void setRoutine(DateTime dateTime) {
            this.routine = dateTime;
        }

        public void setTarget(DateTime dateTime) {
            this.target = dateTime;
        }

        public void setThermoInsight(DateTime dateTime) {
            this.thermoInsight = dateTime;
        }
    }

    /* synthetic */ LastUpdate(DateTime dateTime, Map map, Map map2, int i11) {
        this(dateTime, map, map2);
    }

    public DateTime getAccount() {
        DateTime dateTime = this.account;
        if (dateTime == null) {
            return new DateTime(0L);
        }
        return dateTime;
    }

    public Device getDevice(long j5) {
        Device device = this.devices.get(Long.valueOf(j5));
        if (device == null) {
            return new Device();
        }
        return device;
    }

    public User getUser(long j5) {
        User user = this.users.get(Long.valueOf(j5));
        if (user == null) {
            return new User();
        }
        return user;
    }

    private LastUpdate(DateTime dateTime, Map<Long, User> map, Map<Long, Device> map2) {
        this.account = dateTime;
        this.users = map;
        this.devices = map2;
    }
}
