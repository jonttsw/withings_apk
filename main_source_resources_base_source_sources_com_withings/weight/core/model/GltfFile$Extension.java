package com.withings.weight.core.model;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GltfFile.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/withings/weight/core/model/GltfFile$Extension", "", "Lcom/withings/weight/core/model/GltfFile$Extension;", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GltfFile$Extension {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ GltfFile$Extension[] f46977a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.weight.core.model.GltfFile$Extension] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.weight.core.model.GltfFile$Extension] */
    static {
        GltfFile$Extension[] gltfFile$ExtensionArr = {new Enum("Glb", 0), new Enum("Gltf", 1)};
        f46977a = gltfFile$ExtensionArr;
        b.a(gltfFile$ExtensionArr);
    }

    private GltfFile$Extension() {
        throw null;
    }

    public static GltfFile$Extension valueOf(String str) {
        return (GltfFile$Extension) Enum.valueOf(GltfFile$Extension.class, str);
    }

    public static GltfFile$Extension[] values() {
        return (GltfFile$Extension[]) f46977a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        u.i(lowerCase, "toLowerCase(...)");
        return ".".concat(lowerCase);
    }
}
