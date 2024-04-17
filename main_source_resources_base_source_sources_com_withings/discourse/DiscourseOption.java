package com.withings.discourse;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscourseViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/discourse/DiscourseOption;", "", "discourse_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DiscourseOption {

    /* renamed from: b  reason: collision with root package name */
    public static final DiscourseOption f37972b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ DiscourseOption[] f37973c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f37974d;

    /* renamed from: a  reason: collision with root package name */
    private final String f37975a;

    static {
        DiscourseOption discourseOption = new DiscourseOption("SCREENSHOT", 0, "Add a screenshot");
        DiscourseOption discourseOption2 = new DiscourseOption("CAMERA", 1, "Take picture");
        f37972b = discourseOption2;
        DiscourseOption[] discourseOptionArr = {discourseOption, discourseOption2, new DiscourseOption("GALLERY", 2, "Pick from gallery"), new DiscourseOption("NO_PICTURE", 3, "Without picture")};
        f37973c = discourseOptionArr;
        f37974d = sm0.b.a(discourseOptionArr);
    }

    private DiscourseOption(String str, int i11, String str2) {
        this.f37975a = str2;
    }

    public static sm0.a<DiscourseOption> a() {
        return f37974d;
    }

    public static DiscourseOption valueOf(String str) {
        return (DiscourseOption) Enum.valueOf(DiscourseOption.class, str);
    }

    public static DiscourseOption[] values() {
        return (DiscourseOption[]) f37973c.clone();
    }

    public final String b() {
        return this.f37975a;
    }
}
