package com.withings.vasistas.ws;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.util.log.Fail;
import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.model.VasistasSerie;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: WsVasistasSerializer.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\tH\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010%\u001a\u00020\u0004H\u0002J\b\u0010&\u001a\u00020\u0004H\u0002J\b\u0010'\u001a\u00020\u0004H\u0002J\b\u0010(\u001a\u00020\u0004H\u0002J\b\u0010)\u001a\u00020\u0004H\u0002J\b\u0010*\u001a\u00020\u0004H\u0002J\b\u0010+\u001a\u00020\u0004H\u0002J\b\u0010,\u001a\u00020\u0004H\u0002J\b\u0010-\u001a\u00020\u0004H\u0002J\b\u0010.\u001a\u00020\u0004H\u0002¨\u0006/"}, d2 = {"Lcom/withings/vasistas/ws/WsVasistasSerializer;", "", "()V", "ahiVasistasToJson", "Lcom/google/gson/JsonArray;", WsVasistasSerie.KEY_VASISTAS, "Lcom/withings/vasistas/model/Vasistas;", "bodyVasistasToJson", "checkSerie", "Lcom/withings/vasistas/model/Vasistas$VasistasType;", "serie", "Lcom/withings/vasistas/model/VasistasSerie;", "coreTemperatureVasistasToJson", "dayVasistasToJson", "elevationVasistasToJson", "emptyVasistasToJson", "getTypes", "category", "Lcom/withings/vasistas/model/Vasistas$Category;", "type", "isCoreTemperatureToRemove", "", "jsonFromVasistas", "pauseVasistasToJson", "serialize", "", "series", "", "serializeVasistasSerie", "Lcom/google/gson/JsonObject;", "serieJsonFrom", "vasistasArray", WsVasistasSerie.KEY_DATES, "vasistasType", "sleepVasistasToJson", "spO2VasistasToJson", "swimVasistasToJson", "typesForAHIVasistas", "typesForBodyVasistas", "typesForCoreTemperatureVasistas", "typesForDayVasistas", "typesForElevationVasistas", "typesForEmptyVasistas", "typesForPauseVasistas", "typesForSleepVasistas", "typesForSpO2Vasistas", "typesForSwimVasistas", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsVasistasSerializer {

    /* compiled from: WsVasistasSerializer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Vasistas.VasistasType.values().length];
            try {
                iArr[Vasistas.VasistasType.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Vasistas.VasistasType.SLEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Vasistas.VasistasType.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Vasistas.VasistasType.SWIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Vasistas.VasistasType.ELEVATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Vasistas.Category.values().length];
            try {
                iArr2[Vasistas.Category.BED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Vasistas.Category.MOTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Vasistas.Category.ELEVATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Vasistas.Category.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Vasistas.Category.SWIM.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Vasistas.Category.PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Vasistas.Category.SPO2.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Vasistas.Category.AHI.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Vasistas.Category.CORE_TEMPERATURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final JsonArray ahiVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        jsonArray.add(vasistas.getApneaHypopneaIndex());
        jsonArray.add(vasistas.getBreathingProbability());
        return jsonArray;
    }

    private final JsonArray bodyVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getHeartRate()));
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        jsonArray.add(Integer.valueOf(vasistas.getSkinTemperature()));
        jsonArray.add(Integer.valueOf(vasistas.getHeartRateMeasureQuality()));
        jsonArray.add(Integer.valueOf(vasistas.getHrState()));
        jsonArray.add(Integer.valueOf(vasistas.getHrLevel()));
        return jsonArray;
    }

    private final Vasistas.VasistasType checkSerie(VasistasSerie vasistasSerie) {
        boolean z5;
        if (vasistasSerie != null && !vasistasSerie.getVasistasList().isEmpty()) {
            z5 = false;
        } else {
            z5 = true;
        }
        Fail.i("Trying to create Json from no vasistas", z5);
        if (vasistasSerie == null || vasistasSerie.getVasistasList().size() < 1) {
            return null;
        }
        Vasistas.VasistasType vasistasType = vasistasSerie.getVasistasType();
        if (vasistasType != Vasistas.VasistasType.DAY && vasistasType != Vasistas.VasistasType.SLEEP && vasistasType != Vasistas.VasistasType.EMPTY && vasistasType != Vasistas.VasistasType.SWIM && vasistasType != Vasistas.VasistasType.SPO2 && vasistasType != Vasistas.VasistasType.ELEVATION && vasistasType != Vasistas.VasistasType.AHI) {
            Fail.j("Incorrect type of Vasistas : " + vasistasType);
            return null;
        }
        return vasistasType;
    }

    private final JsonArray coreTemperatureVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        WsVasistasSerializerKt.addTruncatedFloat(jsonArray, vasistas.getCoreTemperature());
        return jsonArray;
    }

    private final JsonArray dayVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getSteps()));
        WsVasistasSerializerKt.addTruncatedFloat(jsonArray, vasistas.getAscent());
        WsVasistasSerializerKt.addTruncatedFloat(jsonArray, vasistas.getEarnedCalories());
        WsVasistasSerializerKt.addTruncatedFloat(jsonArray, vasistas.getMet());
        WsVasistasSerializerKt.addTruncatedFloat(jsonArray, vasistas.getDistance());
        WsVasistasSerializerKt.addTruncatedFloat(jsonArray, vasistas.getClassifierFeature());
        Vasistas.ActivityType activityType = vasistas.getActivityType();
        kotlin.jvm.internal.u.g(activityType);
        jsonArray.add(Integer.valueOf(activityType.getWsValue()));
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        jsonArray.add(Integer.valueOf(vasistas.getActivityRecognitionData2()));
        return jsonArray;
    }

    private final JsonArray elevationVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        jsonArray.add(Float.valueOf(vasistas.getAscent()));
        return jsonArray;
    }

    private final JsonArray emptyVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        return jsonArray;
    }

    private final JsonArray getTypes(Vasistas.Category category, Vasistas.VasistasType vasistasType) {
        switch (WhenMappings.$EnumSwitchMapping$1[category.ordinal()]) {
            case 1:
            case 2:
                int i11 = WhenMappings.$EnumSwitchMapping$0[vasistasType.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                return typesForSwimVasistas();
                            }
                            throw new UnsupportedOperationException("Vasistas not supported : type = " + vasistasType + " category = " + category);
                        }
                        return typesForEmptyVasistas();
                    }
                    return typesForSleepVasistas();
                }
                return typesForDayVasistas();
            case 3:
                return typesForElevationVasistas();
            case 4:
                return typesForBodyVasistas();
            case 5:
                return typesForSwimVasistas();
            case 6:
                return typesForPauseVasistas();
            case 7:
                return typesForSpO2Vasistas();
            case 8:
                return typesForAHIVasistas();
            case 9:
                return typesForCoreTemperatureVasistas();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean isCoreTemperatureToRemove(Vasistas vasistas) {
        if (vasistas.getCategory() == Vasistas.Category.CORE_TEMPERATURE) {
            float coreTemperature = vasistas.getCoreTemperature();
            if (35.0f > coreTemperature || coreTemperature > 43.0f) {
                return true;
            }
        }
        return false;
    }

    private final JsonArray jsonFromVasistas(Vasistas vasistas, Vasistas.Category category) {
        int i11;
        Vasistas.VasistasType type = vasistas.getType();
        switch (WhenMappings.$EnumSwitchMapping$1[category.ordinal()]) {
            case 1:
            case 2:
                if (type == null) {
                    i11 = -1;
                } else {
                    i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    return elevationVasistasToJson(vasistas);
                                }
                                throw new UnsupportedOperationException("Vasistas not supported : type = " + type + " category = " + category);
                            }
                            return swimVasistasToJson(vasistas);
                        }
                        return emptyVasistasToJson(vasistas);
                    }
                    return sleepVasistasToJson(vasistas);
                }
                return dayVasistasToJson(vasistas);
            case 3:
                return elevationVasistasToJson(vasistas);
            case 4:
                return bodyVasistasToJson(vasistas);
            case 5:
                return swimVasistasToJson(vasistas);
            case 6:
                return pauseVasistasToJson(vasistas);
            case 7:
                return spO2VasistasToJson(vasistas);
            case 8:
                return ahiVasistasToJson(vasistas);
            case 9:
                return coreTemperatureVasistasToJson(vasistas);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final JsonArray pauseVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        jsonArray.add(vasistas.getPauseType());
        return jsonArray;
    }

    private final JsonObject serializeVasistasSerie(VasistasSerie vasistasSerie) {
        boolean z5;
        Vasistas.VasistasType checkSerie = checkSerie(vasistasSerie);
        if (checkSerie == null) {
            return null;
        }
        JsonArray jsonArray = new JsonArray();
        JsonArray jsonArray2 = new JsonArray();
        for (Vasistas vasistas : vasistasSerie.getVasistasList()) {
            if (vasistas.getType() != checkSerie) {
                z5 = true;
            } else {
                z5 = false;
            }
            Fail.i("List of vasistas with different types", z5);
            if (vasistas.getType() == checkSerie && !isCoreTemperatureToRemove(vasistas)) {
                jsonArray.add(jsonFromVasistas(vasistas, vasistasSerie.getCategory()));
                jsonArray2.add(Long.valueOf(vasistas.getStartDate().getMillis() / 1000));
            }
        }
        return serieJsonFrom(vasistasSerie, jsonArray, jsonArray2, checkSerie);
    }

    private final JsonObject serieJsonFrom(VasistasSerie vasistasSerie, JsonArray jsonArray, JsonArray jsonArray2, Vasistas.VasistasType vasistasType) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(WsVasistasSerie.KEY_FORMAT, "byvasistas");
        jsonObject.add(WsVasistasSerie.KEY_DATES, jsonArray2);
        jsonObject.addProperty(WsVasistasSerie.KEY_MODEL, Integer.valueOf(vasistasSerie.getDeviceModel()));
        jsonObject.add(WsVasistasSerie.KEY_TYPES, getTypes(vasistasSerie.getCategory(), vasistasType));
        jsonObject.add(WsVasistasSerie.KEY_VASISTAS, jsonArray);
        if (vasistasSerie.getAlgoVersion() != null) {
            jsonObject.addProperty(WsVasistasSerie.KEY_ALGO, vasistasSerie.getAlgoVersion());
        }
        if (vasistasSerie.getFirmware() != null) {
            jsonObject.addProperty(WsVasistasSerie.KEY_FW, vasistasSerie.getFirmware());
        }
        return jsonObject;
    }

    private final JsonArray sleepVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        WsVasistasSerializerKt.addTruncatedFloat(jsonArray, vasistas.getEarnedCalories());
        WsVasistasSerializerKt.addTruncatedFloat(jsonArray, vasistas.getMet());
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        jsonArray.add(Integer.valueOf(vasistas.getSleepLevel()));
        return jsonArray;
    }

    private final JsonArray spO2VasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        jsonArray.add(vasistas.getSpo2());
        jsonArray.add(vasistas.getSpo2Quality());
        return jsonArray;
    }

    private final JsonArray swimVasistasToJson(Vasistas vasistas) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(Integer.valueOf(vasistas.getDurationMillis() / 1000));
        jsonArray.add(Integer.valueOf(vasistas.getSwimMovements()));
        jsonArray.add(Integer.valueOf(vasistas.getSwimLaps()));
        jsonArray.add(Integer.valueOf(vasistas.getSwimType()));
        return jsonArray;
    }

    private final JsonArray typesForAHIVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 43);
        jsonArray.add(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX));
        jsonArray.add(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY));
        return jsonArray;
    }

    private final JsonArray typesForBodyVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 11);
        jsonArray.add((Number) 43);
        jsonArray.add((Number) 73);
        jsonArray.add((Number) 89);
        jsonArray.add(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_HR_STATE));
        jsonArray.add(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_HR_LEVEL));
        return jsonArray;
    }

    private final JsonArray typesForCoreTemperatureVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 43);
        jsonArray.add((Number) 208);
        return jsonArray;
    }

    private final JsonArray typesForDayVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 36);
        jsonArray.add((Number) 37);
        jsonArray.add((Number) 87);
        jsonArray.add((Number) 39);
        jsonArray.add((Number) 40);
        jsonArray.add((Number) 41);
        jsonArray.add((Number) 42);
        jsonArray.add((Number) 43);
        jsonArray.add((Number) 120);
        return jsonArray;
    }

    private final JsonArray typesForElevationVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 43);
        jsonArray.add((Number) 37);
        return jsonArray;
    }

    private final JsonArray typesForEmptyVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 43);
        return jsonArray;
    }

    private final JsonArray typesForPauseVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 43);
        jsonArray.add(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_PAUSE));
        return jsonArray;
    }

    private final JsonArray typesForSleepVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 87);
        jsonArray.add((Number) 39);
        jsonArray.add((Number) 43);
        jsonArray.add((Number) 44);
        return jsonArray;
    }

    private final JsonArray typesForSpO2Vasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 43);
        jsonArray.add((Number) 54);
        jsonArray.add((Number) 89);
        return jsonArray;
    }

    private final JsonArray typesForSwimVasistas() {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add((Number) 43);
        jsonArray.add((Number) 59);
        jsonArray.add((Number) 70);
        jsonArray.add((Number) 42);
        return jsonArray;
    }

    public final String serialize(List<VasistasSerie> series) {
        kotlin.jvm.internal.u.j(series, "series");
        JsonArray jsonArray = new JsonArray();
        for (VasistasSerie vasistasSerie : series) {
            JsonObject serializeVasistasSerie = serializeVasistasSerie(vasistasSerie);
            if (serializeVasistasSerie != null) {
                jsonArray.add(serializeVasistasSerie);
            }
        }
        String jsonElement = jsonArray.toString();
        kotlin.jvm.internal.u.i(jsonElement, "toString(...)");
        return jsonElement;
    }
}
