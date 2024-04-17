package com.withings.common.compose.component.input;

import com.huawei.hms.hihealth.data.DeviceInfo;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InputField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/input/InputFieldType;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class InputFieldType {

    /* renamed from: d  reason: collision with root package name */
    public static final InputFieldType f33876d;

    /* renamed from: e  reason: collision with root package name */
    public static final InputFieldType f33877e;

    /* renamed from: f  reason: collision with root package name */
    public static final InputFieldType f33878f;

    /* renamed from: g  reason: collision with root package name */
    public static final InputFieldType f33879g;

    /* renamed from: h  reason: collision with root package name */
    public static final InputFieldType f33880h;

    /* renamed from: i  reason: collision with root package name */
    public static final InputFieldType f33881i;

    /* renamed from: j  reason: collision with root package name */
    public static final InputFieldType f33882j;

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ InputFieldType[] f33883k;

    /* renamed from: a  reason: collision with root package name */
    private final int f33884a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33885b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33886c;

    static {
        InputFieldType inputFieldType = new InputFieldType("Text", 0, 1, 3, 4);
        f33876d = inputFieldType;
        InputFieldType inputFieldType2 = new InputFieldType("TextArea", 1, 1, 3, false);
        f33877e = inputFieldType2;
        InputFieldType inputFieldType3 = new InputFieldType("Email", 2, 6, 0, 6);
        f33878f = inputFieldType3;
        InputFieldType inputFieldType4 = new InputFieldType("Number", 3, 3, 0, 6);
        f33879g = inputFieldType4;
        InputFieldType inputFieldType5 = new InputFieldType("Password", 4, 7, 0, 6);
        f33880h = inputFieldType5;
        InputFieldType inputFieldType6 = new InputFieldType("PasswordClear", 5, 1, 0, 4);
        f33881i = inputFieldType6;
        InputFieldType inputFieldType7 = new InputFieldType(DeviceInfo.STR_TYPE_PHONE, 6, 4, 0, 6);
        f33882j = inputFieldType7;
        InputFieldType[] inputFieldTypeArr = {inputFieldType, inputFieldType2, inputFieldType3, inputFieldType4, inputFieldType5, inputFieldType6, inputFieldType7};
        f33883k = inputFieldTypeArr;
        b.a(inputFieldTypeArr);
    }

    /* synthetic */ InputFieldType(String str, int i11, int i12, int i13, int i14) {
        this(str, i11, i12, (i14 & 2) != 0 ? 0 : i13, true);
    }

    public static InputFieldType valueOf(String str) {
        return (InputFieldType) Enum.valueOf(InputFieldType.class, str);
    }

    public static InputFieldType[] values() {
        return (InputFieldType[]) f33883k.clone();
    }

    public final int a() {
        return this.f33885b;
    }

    public final int b() {
        return this.f33884a;
    }

    public final boolean d() {
        return this.f33886c;
    }

    private InputFieldType(String str, int i11, int i12, int i13, boolean z5) {
        this.f33884a = i12;
        this.f33885b = i13;
        this.f33886c = z5;
    }
}
