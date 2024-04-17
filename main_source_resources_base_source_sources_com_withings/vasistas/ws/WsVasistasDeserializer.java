package com.withings.vasistas.ws;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.util.log.Fail;
import com.withings.vasistas.model.Vasistas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class WsVasistasDeserializer {
    private Vasistas.Category category;
    private long userId;
    private Map<Integer, ValueSetter> valueSetters = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class IgnoredValueSetter implements ValueSetter {
        private boolean logged;
        private int type;

        /* synthetic */ IgnoredValueSetter(int i11, int i12) {
            this(i11);
        }

        @Override // com.withings.vasistas.ws.WsVasistasDeserializer.ValueSetter
        public void setValue(Vasistas vasistas, Double d11) {
            if (!this.logged) {
                x70.b.t(WsVasistasDeserializer.class, "Ignored type in vasistas : %d", Integer.valueOf(this.type));
            }
            this.logged = true;
        }

        private IgnoredValueSetter(int i11) {
            this.type = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface ValueSetter {
        void setValue(Vasistas vasistas, Double d11);
    }

    public WsVasistasDeserializer(long j5, Vasistas.Category category) {
        this.userId = j5;
        this.category = category;
        initValueSetters();
    }

    private Vasistas deserializeVasistas(List<Double> list, DateTime dateTime, Vasistas.VasistasType vasistasType, WsVasistasSerie wsVasistasSerie) {
        if (wsVasistasSerie.types.size() != list.size()) {
            Fail.j("Number of types is different than number of values");
            return null;
        }
        Vasistas vasistas = new Vasistas(dateTime);
        vasistas.setUserId(Long.valueOf(this.userId));
        vasistas.setCategory(this.category);
        vasistas.setType(vasistasType);
        vasistas.setDeviceModel(wsVasistasSerie.model);
        vasistas.setVersion(wsVasistasSerie.version);
        vasistas.setAlgoVersion(wsVasistasSerie.algo);
        vasistas.setFirmwareVersion(wsVasistasSerie.f46399fw);
        vasistas.setAppPfmId(wsVasistasSerie.apppfmid);
        vasistas.setAppliVersion(wsVasistasSerie.appliver);
        vasistas.setSyncedToWs(true);
        for (int i11 = 0; i11 < wsVasistasSerie.types.size(); i11++) {
            Integer num = wsVasistasSerie.types.get(i11);
            int intValue = num.intValue();
            ValueSetter valueSetter = this.valueSetters.get(num);
            if (valueSetter == null) {
                valueSetter = new IgnoredValueSetter(intValue, 0);
                this.valueSetters.put(num, valueSetter);
            }
            valueSetter.setValue(vasistas, list.get(i11));
        }
        return vasistas;
    }

    private static Vasistas.VasistasType getVasistasTypeFromFields(List<Integer> list) {
        boolean z5;
        boolean contains = list.contains(44);
        boolean contains2 = list.contains(43);
        boolean contains3 = list.contains(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX));
        boolean contains4 = list.contains(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY));
        boolean contains5 = list.contains(54);
        if (list.contains(37) && !list.contains(36)) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean contains6 = list.contains(70);
        if (contains2 && list.size() == 1) {
            return Vasistas.VasistasType.EMPTY;
        }
        if (contains) {
            return Vasistas.VasistasType.SLEEP;
        }
        if (!contains3 && !contains4) {
            if (contains5) {
                return Vasistas.VasistasType.SPO2;
            }
            if (contains6) {
                return Vasistas.VasistasType.SWIM;
            }
            if (z5) {
                return Vasistas.VasistasType.ELEVATION;
            }
            return Vasistas.VasistasType.DAY;
        }
        return Vasistas.VasistasType.AHI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initValueSetters() {
        this.valueSetters.put(36, new ValueSetter() { // from class: com.withings.vasistas.ws.a
            @Override // com.withings.vasistas.ws.WsVasistasDeserializer.ValueSetter
            public final void setValue(Vasistas vasistas, Double d11) {
                switch (r1) {
                    case 0:
                        WsVasistasDeserializer.lambda$initValueSetters$0(vasistas, d11);
                        return;
                    default:
                        WsVasistasDeserializer.lambda$initValueSetters$8(vasistas, d11);
                        return;
                }
            }
        });
        this.valueSetters.put(37, new Object());
        this.valueSetters.put(38, new Object());
        this.valueSetters.put(87, new Object());
        this.valueSetters.put(39, new Object());
        this.valueSetters.put(40, new Object());
        this.valueSetters.put(41, new Object());
        this.valueSetters.put(120, new Object());
        this.valueSetters.put(42, new ValueSetter() { // from class: com.withings.vasistas.ws.a
            @Override // com.withings.vasistas.ws.WsVasistasDeserializer.ValueSetter
            public final void setValue(Vasistas vasistas, Double d11) {
                switch (r1) {
                    case 0:
                        WsVasistasDeserializer.lambda$initValueSetters$0(vasistas, d11);
                        return;
                    default:
                        WsVasistasDeserializer.lambda$initValueSetters$8(vasistas, d11);
                        return;
                }
            }
        });
        this.valueSetters.put(43, new ValueSetter() { // from class: com.withings.vasistas.ws.l
            @Override // com.withings.vasistas.ws.WsVasistasDeserializer.ValueSetter
            public final void setValue(Vasistas vasistas, Double d11) {
                switch (r1) {
                    case 0:
                        WsVasistasDeserializer.lambda$initValueSetters$10(vasistas, d11);
                        return;
                    default:
                        WsVasistasDeserializer.lambda$initValueSetters$9(vasistas, d11);
                        return;
                }
            }
        });
        this.valueSetters.put(44, new ValueSetter() { // from class: com.withings.vasistas.ws.l
            @Override // com.withings.vasistas.ws.WsVasistasDeserializer.ValueSetter
            public final void setValue(Vasistas vasistas, Double d11) {
                switch (r1) {
                    case 0:
                        WsVasistasDeserializer.lambda$initValueSetters$10(vasistas, d11);
                        return;
                    default:
                        WsVasistasDeserializer.lambda$initValueSetters$9(vasistas, d11);
                        return;
                }
            }
        });
        this.valueSetters.put(121, new Object());
        this.valueSetters.put(11, new Object());
        this.valueSetters.put(59, new Object());
        this.valueSetters.put(70, new Object());
        this.valueSetters.put(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX), new Object());
        this.valueSetters.put(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY), new Object());
        this.valueSetters.put(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_PAUSE), new Object());
        this.valueSetters.put(54, new Object());
        this.valueSetters.put(89, new Object());
        this.valueSetters.put(57, new Object());
        this.valueSetters.put(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_HR_STATE), new Object());
        this.valueSetters.put(Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_HR_LEVEL), new Object());
        this.valueSetters.put(208, new Object());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$0(Vasistas vasistas, Double d11) {
        vasistas.setSteps(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$1(Vasistas vasistas, Double d11) {
        vasistas.setAscent(d11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$10(Vasistas vasistas, Double d11) {
        vasistas.setSleepLevel(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$11(Vasistas vasistas, Double d11) {
        vasistas.setSnoringDurationRatio(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$12(Vasistas vasistas, Double d11) {
        vasistas.setHeartRate(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$13(Vasistas vasistas, Double d11) {
        vasistas.setSwimMovements(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$14(Vasistas vasistas, Double d11) {
        vasistas.setSwimLaps(d11.intValue());
        vasistas.setActivityType(Vasistas.ActivityType.SWIM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$15(Vasistas vasistas, Double d11) {
        vasistas.setApneaHypopneaIndex(Integer.valueOf(d11.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$16(Vasistas vasistas, Double d11) {
        vasistas.setBreathingProbability(Integer.valueOf(d11.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$17(Vasistas vasistas, Double d11) {
        vasistas.setPauseType(Integer.valueOf(d11.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$18(Vasistas vasistas, Double d11) {
        vasistas.setSpo2(Integer.valueOf(d11.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$19(Vasistas vasistas, Double d11) {
        vasistas.setSpo2Quality(Integer.valueOf(d11.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$2(Vasistas vasistas, Double d11) {
        vasistas.setCalories(d11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$20(Vasistas vasistas, Double d11) {
        vasistas.setRespiratoryRate(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$21(Vasistas vasistas, Double d11) {
        vasistas.setHrState(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$22(Vasistas vasistas, Double d11) {
        vasistas.setHrLevel(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$23(Vasistas vasistas, Double d11) {
        vasistas.setCoreTemperature(d11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$3(Vasistas vasistas, Double d11) {
        vasistas.setEarnedCalories(d11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$4(Vasistas vasistas, Double d11) {
        vasistas.setMet(d11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$5(Vasistas vasistas, Double d11) {
        vasistas.setDistance(d11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$6(Vasistas vasistas, Double d11) {
        vasistas.setClassifierFeature(d11.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$7(Vasistas vasistas, Double d11) {
        vasistas.setActivityRecognitionData2(d11.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$8(Vasistas vasistas, Double d11) {
        vasistas.setSwimType(d11.intValue());
        vasistas.setActivityType(Vasistas.ActivityType.fromWsValue(d11.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initValueSetters$9(Vasistas vasistas, Double d11) {
        vasistas.setDurationMillis(d11.intValue() * 1000);
    }

    public List<Vasistas> deserializeVasistasSerie(WsVasistasSerie wsVasistasSerie) {
        if (wsVasistasSerie.vasistas.size() != wsVasistasSerie.dates.size()) {
            Fail.j("Number of dates is different than number of vasistas\nVasistas count : " + wsVasistasSerie.vasistas.size() + " ; Dates count = " + wsVasistasSerie.dates.size());
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Vasistas.VasistasType vasistasTypeFromFields = getVasistasTypeFromFields(wsVasistasSerie.types);
        for (int i11 = 0; i11 < wsVasistasSerie.vasistas.size(); i11++) {
            Vasistas deserializeVasistas = deserializeVasistas(wsVasistasSerie.vasistas.get(i11), wsVasistasSerie.dates.get(i11), vasistasTypeFromFields, wsVasistasSerie);
            if (deserializeVasistas != null) {
                arrayList.add(deserializeVasistas);
            }
        }
        return arrayList;
    }
}
