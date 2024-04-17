package com.withings.devicescreens.model;

import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CustomScreenMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/devicescreens/model/CustomScreenMode;", "", "(Ljava/lang/String;I)V", "RECOMMENDED", "CUSTOM", "DRAGGABLE", "devicescreens_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomScreenMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CustomScreenMode[] $VALUES;
    public static final CustomScreenMode RECOMMENDED = new CustomScreenMode("RECOMMENDED", 0);
    public static final CustomScreenMode CUSTOM = new CustomScreenMode("CUSTOM", 1);
    public static final CustomScreenMode DRAGGABLE = new CustomScreenMode("DRAGGABLE", 2);

    private static final /* synthetic */ CustomScreenMode[] $values() {
        return new CustomScreenMode[]{RECOMMENDED, CUSTOM, DRAGGABLE};
    }

    static {
        CustomScreenMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private CustomScreenMode(String str, int i11) {
    }

    public static a<CustomScreenMode> getEntries() {
        return $ENTRIES;
    }

    public static CustomScreenMode valueOf(String str) {
        return (CustomScreenMode) Enum.valueOf(CustomScreenMode.class, str);
    }

    public static CustomScreenMode[] values() {
        return (CustomScreenMode[]) $VALUES.clone();
    }
}
