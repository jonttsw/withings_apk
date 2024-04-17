package com.withings.fever.ui.inputLogs;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TemperatureItemInputLogsUI.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/fever/ui/inputLogs/BodyTemperatureLogsType;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BodyTemperatureLogsType {

    /* renamed from: b  reason: collision with root package name */
    public static final BodyTemperatureLogsType f39298b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ BodyTemperatureLogsType[] f39299c;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f39300a;

    static {
        BodyTemperatureLogsType bodyTemperatureLogsType = new BodyTemperatureLogsType(0, Integer.valueOf((int) C1987R.string._TM_SYMPTOMS_), "SYMPTOMS");
        f39298b = bodyTemperatureLogsType;
        BodyTemperatureLogsType[] bodyTemperatureLogsTypeArr = {bodyTemperatureLogsType, new BodyTemperatureLogsType(1, null, "MEDICATION")};
        f39299c = bodyTemperatureLogsTypeArr;
        b.a(bodyTemperatureLogsTypeArr);
    }

    private BodyTemperatureLogsType(int i11, Integer num, String str) {
        this.f39300a = num;
    }

    public static BodyTemperatureLogsType valueOf(String str) {
        return (BodyTemperatureLogsType) Enum.valueOf(BodyTemperatureLogsType.class, str);
    }

    public static BodyTemperatureLogsType[] values() {
        return (BodyTemperatureLogsType[]) f39299c.clone();
    }

    public final Integer a() {
        return this.f39300a;
    }
}
