package com.withings.healthplus.completion.program.ui.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProgramCompletionButtonType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/completion/program/ui/model/ProgramCompletionButtonType;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ProgramCompletionButtonType {

    /* renamed from: a  reason: collision with root package name */
    public static final ProgramCompletionButtonType f40048a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ ProgramCompletionButtonType[] f40049b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.healthplus.completion.program.ui.model.ProgramCompletionButtonType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.healthplus.completion.program.ui.model.ProgramCompletionButtonType] */
    static {
        ?? r02 = new Enum("Fill", 0);
        f40048a = r02;
        ProgramCompletionButtonType[] programCompletionButtonTypeArr = {r02, new Enum("Footer", 1)};
        f40049b = programCompletionButtonTypeArr;
        b.a(programCompletionButtonTypeArr);
    }

    private ProgramCompletionButtonType() {
        throw null;
    }

    public static ProgramCompletionButtonType valueOf(String str) {
        return (ProgramCompletionButtonType) Enum.valueOf(ProgramCompletionButtonType.class, str);
    }

    public static ProgramCompletionButtonType[] values() {
        return (ProgramCompletionButtonType[]) f40049b.clone();
    }
}
