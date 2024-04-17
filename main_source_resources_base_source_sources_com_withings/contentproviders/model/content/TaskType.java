package com.withings.contentproviders.model.content;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TaskType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/contentproviders/model/content/TaskType;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TaskType {

    /* renamed from: a  reason: collision with root package name */
    public static final TaskType f35295a;

    /* renamed from: b  reason: collision with root package name */
    public static final TaskType f35296b;

    /* renamed from: c  reason: collision with root package name */
    public static final TaskType f35297c;

    /* renamed from: d  reason: collision with root package name */
    public static final TaskType f35298d;

    /* renamed from: e  reason: collision with root package name */
    public static final TaskType f35299e;

    /* renamed from: f  reason: collision with root package name */
    public static final TaskType f35300f;

    /* renamed from: g  reason: collision with root package name */
    public static final TaskType f35301g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ TaskType[] f35302h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.contentproviders.model.content.TaskType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.contentproviders.model.content.TaskType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.contentproviders.model.content.TaskType] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.contentproviders.model.content.TaskType] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.contentproviders.model.content.TaskType] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.contentproviders.model.content.TaskType] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.contentproviders.model.content.TaskType] */
    static {
        ?? r02 = new Enum("Article", 0);
        f35295a = r02;
        ?? r12 = new Enum("Discovery", 1);
        f35296b = r12;
        ?? r22 = new Enum("Measurement", 2);
        f35297c = r22;
        ?? r32 = new Enum("Objective", 3);
        f35298d = r32;
        ?? r42 = new Enum("Recipe", 4);
        f35299e = r42;
        ?? r52 = new Enum("Survey", 5);
        f35300f = r52;
        ?? r62 = new Enum("Workout", 6);
        f35301g = r62;
        TaskType[] taskTypeArr = {r02, r12, r22, r32, r42, r52, r62};
        f35302h = taskTypeArr;
        b.a(taskTypeArr);
    }

    private TaskType() {
        throw null;
    }

    public static TaskType valueOf(String str) {
        return (TaskType) Enum.valueOf(TaskType.class, str);
    }

    public static TaskType[] values() {
        return (TaskType[]) f35302h.clone();
    }
}
