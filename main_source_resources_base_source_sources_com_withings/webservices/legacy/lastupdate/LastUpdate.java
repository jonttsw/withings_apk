package com.withings.webservices.legacy.lastupdate;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.DateTimeSerializer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class LastUpdate {
    static final String VASISTAS_BED_NAME = "32";
    static final String VASISTAS_MOTION_NAME = "16";
    private AccountLastUpdate account;
    private Map<Long, DeviceLastUpdate> devices;
    private Map<Long, UserLastUpdate> users;

    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<LastUpdate> {
        private DateTimeSerializer dateTimeSerializer = new DateTimeSerializer();

        private AccountLastUpdate deserializeAccount(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            JsonElement jsonElement = jsonObject.get(ConstantsWs.JSON_ACCOUNT_KEY_ACCOUNTS);
            if (jsonElement != null && jsonElement.isJsonArray() && jsonElement.getAsJsonArray().size() != 0) {
                JsonElement jsonElement2 = ((JsonArray) jsonElement).get(0);
                if (!jsonElement2.isJsonObject()) {
                    return new AccountLastUpdate();
                }
                JsonObject jsonObject2 = (JsonObject) jsonElement2;
                return new AccountLastUpdate(jsonObject2.get("id").getAsLong(), deserializeDateTime(jsonObject2.get("plan"), jsonDeserializationContext), deserializeDateTime(jsonObject2.get("wellness"), jsonDeserializationContext), deserializeDateTime(jsonObject2.get("virtualdevice"), jsonDeserializationContext), deserializeDateTime(jsonObject2.get("modified"), jsonDeserializationContext), deserializeDateTime(jsonObject2.get("feature"), jsonDeserializationContext), deserializeDateTime(jsonObject2.get("timeline.section"), jsonDeserializationContext));
            }
            return new AccountLastUpdate();
        }

        private Map<String, DateTime> deserializeActivityTimes(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return deserializeList(jsonObject, jsonDeserializationContext, "activity");
        }

        private DateTime deserializeDateTime(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
            DateTime deserializeDateTimeOrNull = deserializeDateTimeOrNull(jsonElement, jsonDeserializationContext);
            if (deserializeDateTimeOrNull == null) {
                return new DateTime(0L);
            }
            return deserializeDateTimeOrNull;
        }

        private DateTime deserializeDateTimeOrNull(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
            if (jsonElement != null && !jsonElement.isJsonNull()) {
                return this.dateTimeSerializer.deserialize(jsonElement, (Type) DateTime.class, jsonDeserializationContext);
            }
            return null;
        }

        private DeviceLastUpdate deserializeDevice(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            DeviceLastUpdate deviceLastUpdate = new DeviceLastUpdate(jsonObject.get("id").getAsLong());
            deviceLastUpdate.setModified(deserializeDateTime(jsonObject.get("modified"), jsonDeserializationContext));
            deviceLastUpdate.setActivity(deserializeActivityTimes(jsonObject, jsonDeserializationContext));
            deviceLastUpdate.setMeasuresHf(deserializeHFMeasures(jsonObject, jsonDeserializationContext));
            deviceLastUpdate.setDeviceScreens(deserializeDateTime(jsonObject.get(MessageType.SCREEN), jsonDeserializationContext));
            deviceLastUpdate.setDeviceScreensContents(deserializeDateTime(jsonObject.get("screencontent"), jsonDeserializationContext));
            deviceLastUpdate.setFeature(deserializeDateTime(jsonObject.get("feature"), jsonDeserializationContext));
            return deviceLastUpdate;
        }

        private Map<Long, DeviceLastUpdate> deserializeDevices(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            HashMap hashMap = new HashMap();
            JsonArray asJsonArray = jsonObject.getAsJsonArray("devices");
            if (asJsonArray == null) {
                return hashMap;
            }
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                DeviceLastUpdate deserializeDevice = deserializeDevice(it.next().getAsJsonObject(), jsonDeserializationContext);
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
                    hashMap.put(key.substring(indexOf + 1), deserializeDateTime(entry.getValue(), jsonDeserializationContext));
                }
            }
            return hashMap;
        }

        private UserLastUpdate deserializeUser(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            UserLastUpdate userLastUpdate = new UserLastUpdate(jsonObject.get("id").getAsLong());
            userLastUpdate.setModified(deserializeDateTime(jsonObject.get("modified"), jsonDeserializationContext));
            userLastUpdate.setAggregate(deserializeDateTime(jsonObject.get("aggregate"), jsonDeserializationContext));
            userLastUpdate.setMeasure(deserializeDateTimeOrNull(jsonObject.get("measure"), jsonDeserializationContext));
            userLastUpdate.setClassifier(deserializeDateTime(jsonObject.get("classifier"), jsonDeserializationContext));
            userLastUpdate.setTarget(deserializeDateTime(jsonObject.get("target"), jsonDeserializationContext));
            userLastUpdate.setNoteGroup(deserializeDateTime(jsonObject.get("notegrp"), jsonDeserializationContext));
            userLastUpdate.setThermoInsight(deserializeDateTime(jsonObject.get("insight_thermo"), jsonDeserializationContext));
            userLastUpdate.setHealthAttribute(deserializeDateTime(jsonObject.get("healthattribute"), jsonDeserializationContext));
            userLastUpdate.setHairCare(deserializeDateTime(jsonObject.get("hair_care"), jsonDeserializationContext));
            userLastUpdate.setRoutine(deserializeDateTime(jsonObject.get(ConstantsWs.SYNC_PROCESS_ROUTINE), jsonDeserializationContext));
            userLastUpdate.setSignal(deserializeDateTime(jsonObject.get("signal"), jsonDeserializationContext));
            userLastUpdate.setInsightCoach(deserializeDateTime(jsonObject.get("insightcoach"), jsonDeserializationContext));
            userLastUpdate.setSubcategory(deserializeDateTime(jsonObject.get(WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME), jsonDeserializationContext));
            userLastUpdate.setWellness(deserializeDateTime(jsonObject.get("wellness"), jsonDeserializationContext));
            userLastUpdate.setBadge(deserializeDateTime(jsonObject.get("badge"), jsonDeserializationContext));
            userLastUpdate.setTimeline(deserializeDateTime(jsonObject.get(ConstantsWs.SYNC_PROCESS_TIMELINE), jsonDeserializationContext));
            userLastUpdate.setLeaderboard(deserializeDateTime(jsonObject.get("leaderboard"), jsonDeserializationContext));
            userLastUpdate.setPartner(deserializeDateTime(jsonObject.get("partner"), jsonDeserializationContext));
            userLastUpdate.setMission(deserializeDateTime(jsonObject.get("mission"), jsonDeserializationContext));
            userLastUpdate.setFeature(deserializeDateTime(jsonObject.get("feature"), jsonDeserializationContext));
            userLastUpdate.setHealthscore(deserializeDateTime(jsonObject.get("healthscore"), jsonDeserializationContext));
            userLastUpdate.setPrediction(deserializeDateTime(jsonObject.get("prediction"), jsonDeserializationContext));
            userLastUpdate.setVasistas(deserializeVasistasTimes(jsonObject, jsonDeserializationContext));
            userLastUpdate.setActivity(deserializeActivityTimes(jsonObject, jsonDeserializationContext));
            return userLastUpdate;
        }

        private Map<Long, UserLastUpdate> deserializeUsers(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            HashMap hashMap = new HashMap();
            JsonArray asJsonArray = jsonObject.getAsJsonArray("users");
            if (asJsonArray == null) {
                return hashMap;
            }
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                UserLastUpdate deserializeUser = deserializeUser(it.next().getAsJsonObject(), jsonDeserializationContext);
                hashMap.put(Long.valueOf(deserializeUser.getUserId()), deserializeUser);
            }
            return hashMap;
        }

        private Map<String, DateTime> deserializeVasistasTimes(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return deserializeList(jsonObject, jsonDeserializationContext, WsVasistasSerie.KEY_VASISTAS);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public LastUpdate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            return new LastUpdate(deserializeAccount(asJsonObject, jsonDeserializationContext), deserializeUsers(asJsonObject, jsonDeserializationContext), deserializeDevices(asJsonObject, jsonDeserializationContext));
        }
    }

    public LastUpdate(AccountLastUpdate accountLastUpdate, Map<Long, UserLastUpdate> map, Map<Long, DeviceLastUpdate> map2) {
        this.account = accountLastUpdate;
        this.users = map;
        this.devices = map2;
    }

    public AccountLastUpdate getAccount() {
        AccountLastUpdate accountLastUpdate = this.account;
        if (accountLastUpdate == null) {
            return new AccountLastUpdate();
        }
        return accountLastUpdate;
    }

    public DeviceLastUpdate getDevice(long j5) {
        DeviceLastUpdate deviceLastUpdate = this.devices.get(Long.valueOf(j5));
        if (deviceLastUpdate == null) {
            return new DeviceLastUpdate(j5);
        }
        return deviceLastUpdate;
    }

    public Map<Long, DeviceLastUpdate> getDevices() {
        return this.devices;
    }

    public UserLastUpdate getUser(long j5) {
        UserLastUpdate userLastUpdate = this.users.get(Long.valueOf(j5));
        if (userLastUpdate == null) {
            return new UserLastUpdate(j5);
        }
        return userLastUpdate;
    }

    public Map<Long, UserLastUpdate> getUsers() {
        return this.users;
    }
}
