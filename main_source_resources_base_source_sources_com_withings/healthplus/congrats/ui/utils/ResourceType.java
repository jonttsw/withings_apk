package com.withings.healthplus.congrats.ui.utils;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: generateResourceValue.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/congrats/ui/utils/ResourceType;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ResourceType {

    /* renamed from: b  reason: collision with root package name */
    public static final ResourceType f40110b;

    /* renamed from: c  reason: collision with root package name */
    public static final ResourceType f40111c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ ResourceType[] f40112d;

    /* renamed from: a  reason: collision with root package name */
    private final String f40113a;

    static {
        ResourceType resourceType = new ResourceType("STRING", 0, "string");
        f40110b = resourceType;
        ResourceType resourceType2 = new ResourceType("DRAWABLE", 1, "drawable");
        f40111c = resourceType2;
        ResourceType[] resourceTypeArr = {resourceType, resourceType2};
        f40112d = resourceTypeArr;
        b.a(resourceTypeArr);
    }

    private ResourceType(String str, int i11, String str2) {
        this.f40113a = str2;
    }

    public static ResourceType valueOf(String str) {
        return (ResourceType) Enum.valueOf(ResourceType.class, str);
    }

    public static ResourceType[] values() {
        return (ResourceType[]) f40112d.clone();
    }

    public final String a() {
        return this.f40113a;
    }
}
