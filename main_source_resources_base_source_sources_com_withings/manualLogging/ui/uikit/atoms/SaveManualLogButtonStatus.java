package com.withings.manualLogging.ui.uikit.atoms;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SaveManualLogButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/uikit/atoms/SaveManualLogButtonStatus;", "", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SaveManualLogButtonStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final SaveManualLogButtonStatus f41667a;

    /* renamed from: b  reason: collision with root package name */
    public static final SaveManualLogButtonStatus f41668b;

    /* renamed from: c  reason: collision with root package name */
    public static final SaveManualLogButtonStatus f41669c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ SaveManualLogButtonStatus[] f41670d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus] */
    static {
        ?? r02 = new Enum("Disable", 0);
        f41667a = r02;
        ?? r12 = new Enum("Enable", 1);
        f41668b = r12;
        ?? r22 = new Enum("Loading", 2);
        f41669c = r22;
        SaveManualLogButtonStatus[] saveManualLogButtonStatusArr = {r02, r12, r22};
        f41670d = saveManualLogButtonStatusArr;
        b.a(saveManualLogButtonStatusArr);
    }

    private SaveManualLogButtonStatus() {
        throw null;
    }

    public static SaveManualLogButtonStatus valueOf(String str) {
        return (SaveManualLogButtonStatus) Enum.valueOf(SaveManualLogButtonStatus.class, str);
    }

    public static SaveManualLogButtonStatus[] values() {
        return (SaveManualLogButtonStatus[]) f41670d.clone();
    }
}
