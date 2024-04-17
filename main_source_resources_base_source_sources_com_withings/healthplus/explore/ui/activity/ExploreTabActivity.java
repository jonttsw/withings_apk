package com.withings.healthplus.explore.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.camera.core.y1;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.contentfavorite.navigation.ContentFavoriteNavGraph;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.congrats.ui.activity.CompletionActivity;
import com.withings.healthplus.congrats.ui.model.SuccessTaskInfo;
import com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation;
import com.withings.healthplus.explore.ui.viewmodel.ExploreTabViewModel;
import com.withings.healthplus.library.ui.navigation.LibraryNavigation;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: ExploreTabActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/healthplus/explore/ui/activity/ExploreTabActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "Landroidx/navigation/d;", "navBackStackEntry", "Lvk/a;", "stateScreen", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ExploreTabActivity extends Hilt_ExploreTabActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ch.d f40242e;

    /* renamed from: f  reason: collision with root package name */
    private r8.n f40243f;

    /* renamed from: g  reason: collision with root package name */
    private final i1 f40244g = new i1(q0.b(ExploreTabViewModel.class), new h(this), new g(this), new i(this));

    /* renamed from: h  reason: collision with root package name */
    private final f f40245h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    private final ym0.a<nm0.y> f40246i = new c();

    /* renamed from: j  reason: collision with root package name */
    private final ym0.q<vt.a, SuccessTaskInfo, Integer, nm0.y> f40247j = new e();

    /* renamed from: k  reason: collision with root package name */
    private final ym0.l<vk.a, nm0.y> f40248k = new b();

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f40241m = {androidx.camera.core.v.c(ExploreTabActivity.class, "startDestination", "getStartDestination()Lcom/withings/healthplus/explore/ui/activity/ExploreTabActivity$Companion$StartDestination;", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f40240l = new Object();

    /* compiled from: ExploreTabActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: ExploreTabActivity.kt */
        /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static abstract class AbstractC0526a implements Serializable {

            /* compiled from: ExploreTabActivity.kt */
            @kotlinx.serialization.Serializable
            /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$b */
            /* loaded from: classes3.dex */
            public static final class b extends AbstractC0526a {
                public static final C0530b Companion = new C0530b(0);

                /* renamed from: a  reason: collision with root package name */
                private final long f40260a;

                /* renamed from: b  reason: collision with root package name */
                private final String f40261b;

                /* compiled from: ExploreTabActivity.kt */
                /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$b$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0529a implements GeneratedSerializer<b> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C0529a f40262a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final /* synthetic */ PluginGeneratedSerialDescriptor f40263b;

                    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.internal.GeneratedSerializer, com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$b$a, java.lang.Object] */
                    static {
                        ?? obj = new Object();
                        f40262a = obj;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.healthplus.explore.ui.activity.ExploreTabActivity.Companion.StartDestination.ContentFavorite", obj, 2);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.USER_ID, false);
                        pluginGeneratedSerialDescriptor.addElement("category", false);
                        f40263b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer<?>[] childSerializers() {
                        return new KSerializer[]{LongSerializer.INSTANCE, StringSerializer.INSTANCE};
                    }

                    @Override // kotlinx.serialization.DeserializationStrategy
                    public final Object deserialize(Decoder decoder) {
                        String str;
                        int i11;
                        long j5;
                        kotlin.jvm.internal.u.j(decoder, "decoder");
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f40263b;
                        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                        if (beginStructure.decodeSequentially()) {
                            j5 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            i11 = 3;
                        } else {
                            str = null;
                            boolean z5 = true;
                            long j11 = 0;
                            int i12 = 0;
                            while (z5) {
                                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                                if (decodeElementIndex != -1) {
                                    if (decodeElementIndex != 0) {
                                        if (decodeElementIndex == 1) {
                                            str = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                            i12 |= 2;
                                        } else {
                                            throw new UnknownFieldException(decodeElementIndex);
                                        }
                                    } else {
                                        j11 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                                        i12 |= 1;
                                    }
                                } else {
                                    z5 = false;
                                }
                            }
                            i11 = i12;
                            j5 = j11;
                        }
                        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                        return new b(i11, j5, str);
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
                    public final SerialDescriptor getDescriptor() {
                        return f40263b;
                    }

                    @Override // kotlinx.serialization.SerializationStrategy
                    public final void serialize(Encoder encoder, Object obj) {
                        b value = (b) obj;
                        kotlin.jvm.internal.u.j(encoder, "encoder");
                        kotlin.jvm.internal.u.j(value, "value");
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f40263b;
                        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                        b.d(value, beginStructure, pluginGeneratedSerialDescriptor);
                        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                    }
                }

                /* compiled from: ExploreTabActivity.kt */
                /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$b$b  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0530b {
                    public /* synthetic */ C0530b(int i11) {
                        this();
                    }

                    public final KSerializer<b> serializer() {
                        return C0529a.f40262a;
                    }

                    private C0530b() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ b(int i11, long j5, String str) {
                    super(0);
                    if (3 != (i11 & 3)) {
                        PluginExceptionsKt.throwMissingFieldException(i11, 3, C0529a.f40262a.getDescriptor());
                    }
                    this.f40260a = j5;
                    this.f40261b = str;
                }

                public static final void d(b bVar, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
                    compositeEncoder.encodeLongElement(pluginGeneratedSerialDescriptor, 0, bVar.f40260a);
                    compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 1, bVar.f40261b);
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final String a() {
                    return ContentFavoriteNavGraph.Destinations.f35242b.a();
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final long b() {
                    return this.f40260a;
                }

                public final String c() {
                    return this.f40261b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    if (this.f40260a == bVar.f40260a && kotlin.jvm.internal.u.e(this.f40261b, bVar.f40261b)) {
                        return true;
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f40261b.hashCode() + (Long.hashCode(this.f40260a) * 31);
                }

                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ContentFavorite(userId=");
                    sb2.append(this.f40260a);
                    sb2.append(", category=");
                    return y1.e(sb2, this.f40261b, ")");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(long j5, String category) {
                    super(0);
                    kotlin.jvm.internal.u.j(category, "category");
                    this.f40260a = j5;
                    this.f40261b = category;
                }
            }

            /* compiled from: ExploreTabActivity.kt */
            /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$c */
            /* loaded from: classes3.dex */
            public static final class c extends AbstractC0526a {

                /* renamed from: a  reason: collision with root package name */
                private final long f40264a;

                /* renamed from: b  reason: collision with root package name */
                private final long f40265b;

                public c(long j5, long j11) {
                    super(0);
                    this.f40264a = j5;
                    this.f40265b = j11;
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final String a() {
                    return NavigationArguments.JoiningProgramLoadingDestination.route;
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final long b() {
                    return this.f40264a;
                }

                public final long c() {
                    return this.f40265b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    if (this.f40264a == cVar.f40264a && this.f40265b == cVar.f40265b) {
                        return true;
                    }
                    return false;
                }

                public final int hashCode() {
                    return Long.hashCode(this.f40265b) + (Long.hashCode(this.f40264a) * 31);
                }

                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("JoiningProgramLoading(userId=");
                    sb2.append(this.f40264a);
                    sb2.append(", programId=");
                    return android.support.v4.media.session.c.c(sb2, this.f40265b, ")");
                }
            }

            /* compiled from: ExploreTabActivity.kt */
            @kotlinx.serialization.Serializable
            /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$e */
            /* loaded from: classes3.dex */
            public static final class e extends AbstractC0526a {
                public static final b Companion = new b(0);

                /* renamed from: a  reason: collision with root package name */
                private final long f40275a;

                /* renamed from: b  reason: collision with root package name */
                private final long f40276b;

                /* renamed from: c  reason: collision with root package name */
                private final int f40277c;

                /* renamed from: d  reason: collision with root package name */
                private final boolean f40278d;

                /* compiled from: ExploreTabActivity.kt */
                /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$e$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0532a implements GeneratedSerializer<e> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C0532a f40279a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final /* synthetic */ PluginGeneratedSerialDescriptor f40280b;

                    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.internal.GeneratedSerializer, com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$e$a, java.lang.Object] */
                    static {
                        ?? obj = new Object();
                        f40279a = obj;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.healthplus.explore.ui.activity.ExploreTabActivity.Companion.StartDestination.ProgramDetail", obj, 4);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.USER_ID, false);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.PROGRAM_ID, false);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.INSTANCE_ID, false);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.SHOULD_DISPLAY_DAYS_BEFORE_START_TOAST, true);
                        f40280b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer<?>[] childSerializers() {
                        LongSerializer longSerializer = LongSerializer.INSTANCE;
                        return new KSerializer[]{longSerializer, longSerializer, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE};
                    }

                    @Override // kotlinx.serialization.DeserializationStrategy
                    public final Object deserialize(Decoder decoder) {
                        int i11;
                        boolean z5;
                        int i12;
                        long j5;
                        long j11;
                        kotlin.jvm.internal.u.j(decoder, "decoder");
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f40280b;
                        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                        if (beginStructure.decodeSequentially()) {
                            long decodeLongElement = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                            long decodeLongElement2 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                            i11 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 2);
                            z5 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                            i12 = 15;
                            j5 = decodeLongElement;
                            j11 = decodeLongElement2;
                        } else {
                            boolean z11 = true;
                            int i13 = 0;
                            long j12 = 0;
                            long j13 = 0;
                            boolean z12 = false;
                            int i14 = 0;
                            while (z11) {
                                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                                if (decodeElementIndex != -1) {
                                    if (decodeElementIndex != 0) {
                                        if (decodeElementIndex != 1) {
                                            if (decodeElementIndex != 2) {
                                                if (decodeElementIndex == 3) {
                                                    z12 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                                                    i14 |= 8;
                                                } else {
                                                    throw new UnknownFieldException(decodeElementIndex);
                                                }
                                            } else {
                                                i13 = beginStructure.decodeIntElement(pluginGeneratedSerialDescriptor, 2);
                                                i14 |= 4;
                                            }
                                        } else {
                                            j13 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 1);
                                            i14 |= 2;
                                        }
                                    } else {
                                        j12 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                                        i14 |= 1;
                                    }
                                } else {
                                    z11 = false;
                                }
                            }
                            i11 = i13;
                            z5 = z12;
                            i12 = i14;
                            j5 = j12;
                            j11 = j13;
                        }
                        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                        return new e(i12, j5, j11, i11, z5);
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
                    public final SerialDescriptor getDescriptor() {
                        return f40280b;
                    }

                    @Override // kotlinx.serialization.SerializationStrategy
                    public final void serialize(Encoder encoder, Object obj) {
                        e value = (e) obj;
                        kotlin.jvm.internal.u.j(encoder, "encoder");
                        kotlin.jvm.internal.u.j(value, "value");
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f40280b;
                        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                        e.f(value, beginStructure, pluginGeneratedSerialDescriptor);
                        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                    }
                }

                /* compiled from: ExploreTabActivity.kt */
                /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$e$b */
                /* loaded from: classes3.dex */
                public static final class b {
                    public /* synthetic */ b(int i11) {
                        this();
                    }

                    public final KSerializer<e> serializer() {
                        return C0532a.f40279a;
                    }

                    private b() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ e(int i11, long j5, long j11, int i12, boolean z5) {
                    super(0);
                    if (7 != (i11 & 7)) {
                        PluginExceptionsKt.throwMissingFieldException(i11, 7, C0532a.f40279a.getDescriptor());
                    }
                    this.f40275a = j5;
                    this.f40276b = j11;
                    this.f40277c = i12;
                    if ((i11 & 8) == 0) {
                        this.f40278d = false;
                    } else {
                        this.f40278d = z5;
                    }
                }

                public static final void f(e eVar, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
                    compositeEncoder.encodeLongElement(pluginGeneratedSerialDescriptor, 0, eVar.f40275a);
                    compositeEncoder.encodeLongElement(pluginGeneratedSerialDescriptor, 1, eVar.f40276b);
                    compositeEncoder.encodeIntElement(pluginGeneratedSerialDescriptor, 2, eVar.f40277c);
                    boolean shouldEncodeElementDefault = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
                    boolean z5 = eVar.f40278d;
                    if (shouldEncodeElementDefault || z5) {
                        compositeEncoder.encodeBooleanElement(pluginGeneratedSerialDescriptor, 3, z5);
                    }
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final String a() {
                    return NavigationArguments.ProgramDetailDestination.route;
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final long b() {
                    return this.f40275a;
                }

                public final int c() {
                    return this.f40277c;
                }

                public final long d() {
                    return this.f40276b;
                }

                public final boolean e() {
                    return this.f40278d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    if (this.f40275a == eVar.f40275a && this.f40276b == eVar.f40276b && this.f40277c == eVar.f40277c && this.f40278d == eVar.f40278d) {
                        return true;
                    }
                    return false;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f40278d) + androidx.appcompat.app.h.a(this.f40277c, androidx.activity.result.c.a(this.f40276b, Long.hashCode(this.f40275a) * 31, 31), 31);
                }

                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ProgramDetail(userId=");
                    sb2.append(this.f40275a);
                    sb2.append(", programId=");
                    sb2.append(this.f40276b);
                    sb2.append(", instanceId=");
                    sb2.append(this.f40277c);
                    sb2.append(", shouldDisplayDaysBeforeStartToast=");
                    return androidx.appcompat.app.h.d(sb2, this.f40278d, ")");
                }

                public e(int i11, long j5, boolean z5, long j11) {
                    super(0);
                    this.f40275a = j5;
                    this.f40276b = j11;
                    this.f40277c = i11;
                    this.f40278d = z5;
                }
            }

            public /* synthetic */ AbstractC0526a(int i11) {
                this();
            }

            public abstract String a();

            public abstract long b();

            private AbstractC0526a() {
            }

            /* compiled from: ExploreTabActivity.kt */
            @kotlinx.serialization.Serializable
            /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$d */
            /* loaded from: classes3.dex */
            public static final class d extends AbstractC0526a {
                public static final b Companion = new b(0);

                /* renamed from: g  reason: collision with root package name */
                private static final KSerializer<Object>[] f40266g = {null, EnumsKt.createSimpleEnumSerializer("com.withings.contentproviders.model.content.TaskType", TaskType.values()), null, null, null, null};

                /* renamed from: a  reason: collision with root package name */
                private final long f40267a;

                /* renamed from: b  reason: collision with root package name */
                private final TaskType f40268b;

                /* renamed from: c  reason: collision with root package name */
                private final String f40269c;

                /* renamed from: d  reason: collision with root package name */
                private final Integer f40270d;

                /* renamed from: e  reason: collision with root package name */
                private final String f40271e;

                /* renamed from: f  reason: collision with root package name */
                private final Integer f40272f;

                /* compiled from: ExploreTabActivity.kt */
                /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$d$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0531a implements GeneratedSerializer<d> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C0531a f40273a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final /* synthetic */ PluginGeneratedSerialDescriptor f40274b;

                    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$d$a, kotlinx.serialization.internal.GeneratedSerializer, java.lang.Object] */
                    static {
                        ?? obj = new Object();
                        f40273a = obj;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.healthplus.explore.ui.activity.ExploreTabActivity.Companion.StartDestination.LibraryCategoryScreen", obj, 6);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.USER_ID, false);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.TASK_TYPE, false);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.CONTENT_ID, true);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.MISSION_ID, true);
                        pluginGeneratedSerialDescriptor.addElement("relatedProgramTaskId", true);
                        pluginGeneratedSerialDescriptor.addElement("filterId", true);
                        f40274b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer<?>[] childSerializers() {
                        KSerializer<?> kSerializer = d.f40266g[1];
                        StringSerializer stringSerializer = StringSerializer.INSTANCE;
                        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(stringSerializer);
                        IntSerializer intSerializer = IntSerializer.INSTANCE;
                        return new KSerializer[]{LongSerializer.INSTANCE, kSerializer, nullable, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
                    }

                    @Override // kotlinx.serialization.DeserializationStrategy
                    public final Object deserialize(Decoder decoder) {
                        int i11;
                        TaskType taskType;
                        String str;
                        Integer num;
                        String str2;
                        Integer num2;
                        long j5;
                        kotlin.jvm.internal.u.j(decoder, "decoder");
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f40274b;
                        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                        KSerializer[] kSerializerArr = d.f40266g;
                        TaskType taskType2 = null;
                        if (beginStructure.decodeSequentially()) {
                            long decodeLongElement = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                            StringSerializer stringSerializer = StringSerializer.INSTANCE;
                            IntSerializer intSerializer = IntSerializer.INSTANCE;
                            taskType = (TaskType) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], null);
                            str2 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, stringSerializer, null);
                            num2 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, intSerializer, null);
                            str = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, stringSerializer, null);
                            i11 = 63;
                            num = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, intSerializer, null);
                            j5 = decodeLongElement;
                        } else {
                            boolean z5 = true;
                            int i12 = 0;
                            String str3 = null;
                            Integer num3 = null;
                            long j11 = 0;
                            String str4 = null;
                            Integer num4 = null;
                            while (z5) {
                                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                                switch (decodeElementIndex) {
                                    case -1:
                                        z5 = false;
                                        continue;
                                    case 0:
                                        j11 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                                        i12 |= 1;
                                        continue;
                                    case 1:
                                        taskType2 = (TaskType) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], taskType2);
                                        i12 |= 2;
                                        break;
                                    case 2:
                                        str4 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str4);
                                        i12 |= 4;
                                        break;
                                    case 3:
                                        num4 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, IntSerializer.INSTANCE, num4);
                                        i12 |= 8;
                                        break;
                                    case 4:
                                        str3 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str3);
                                        i12 |= 16;
                                        break;
                                    case 5:
                                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, IntSerializer.INSTANCE, num3);
                                        i12 |= 32;
                                        break;
                                    default:
                                        throw new UnknownFieldException(decodeElementIndex);
                                }
                            }
                            i11 = i12;
                            taskType = taskType2;
                            str = str4;
                            num = num4;
                            str2 = str3;
                            num2 = num3;
                            j5 = j11;
                        }
                        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                        return new d(i11, j5, taskType, str, num, str2, num2);
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
                    public final SerialDescriptor getDescriptor() {
                        return f40274b;
                    }

                    @Override // kotlinx.serialization.SerializationStrategy
                    public final void serialize(Encoder encoder, Object obj) {
                        d value = (d) obj;
                        kotlin.jvm.internal.u.j(encoder, "encoder");
                        kotlin.jvm.internal.u.j(value, "value");
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f40274b;
                        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                        d.i(value, beginStructure, pluginGeneratedSerialDescriptor);
                        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                    }
                }

                /* compiled from: ExploreTabActivity.kt */
                /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$d$b */
                /* loaded from: classes3.dex */
                public static final class b {
                    public /* synthetic */ b(int i11) {
                        this();
                    }

                    public final KSerializer<d> serializer() {
                        return C0531a.f40273a;
                    }

                    private b() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(long j5, TaskType taskType, String str, Integer num, String str2, Integer num2, int i11) {
                    super(0);
                    str = (i11 & 4) != 0 ? null : str;
                    num = (i11 & 8) != 0 ? null : num;
                    str2 = (i11 & 16) != 0 ? null : str2;
                    num2 = (i11 & 32) != 0 ? null : num2;
                    kotlin.jvm.internal.u.j(taskType, "taskType");
                    this.f40267a = j5;
                    this.f40268b = taskType;
                    this.f40269c = str;
                    this.f40270d = num;
                    this.f40271e = str2;
                    this.f40272f = num2;
                }

                public static final void i(d dVar, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
                    compositeEncoder.encodeLongElement(pluginGeneratedSerialDescriptor, 0, dVar.f40267a);
                    compositeEncoder.encodeSerializableElement(pluginGeneratedSerialDescriptor, 1, f40266g[1], dVar.f40268b);
                    boolean shouldEncodeElementDefault = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2);
                    String str = dVar.f40269c;
                    if (shouldEncodeElementDefault || str != null) {
                        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, StringSerializer.INSTANCE, str);
                    }
                    boolean shouldEncodeElementDefault2 = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
                    Integer num = dVar.f40270d;
                    if (shouldEncodeElementDefault2 || num != null) {
                        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, IntSerializer.INSTANCE, num);
                    }
                    boolean shouldEncodeElementDefault3 = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
                    String str2 = dVar.f40271e;
                    if (shouldEncodeElementDefault3 || str2 != null) {
                        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, StringSerializer.INSTANCE, str2);
                    }
                    boolean shouldEncodeElementDefault4 = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                    Integer num2 = dVar.f40272f;
                    if (shouldEncodeElementDefault4 || num2 != null) {
                        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, IntSerializer.INSTANCE, num2);
                    }
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final String a() {
                    return LibraryNavigation.Destinations.f40408c.a();
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final long b() {
                    return this.f40267a;
                }

                public final String d() {
                    return this.f40269c;
                }

                public final Integer e() {
                    return this.f40272f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    if (this.f40267a == dVar.f40267a && this.f40268b == dVar.f40268b && kotlin.jvm.internal.u.e(this.f40269c, dVar.f40269c) && kotlin.jvm.internal.u.e(this.f40270d, dVar.f40270d) && kotlin.jvm.internal.u.e(this.f40271e, dVar.f40271e) && kotlin.jvm.internal.u.e(this.f40272f, dVar.f40272f)) {
                        return true;
                    }
                    return false;
                }

                public final Integer f() {
                    return this.f40270d;
                }

                public final String g() {
                    return this.f40271e;
                }

                public final TaskType h() {
                    return this.f40268b;
                }

                public final int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3;
                    int hashCode4 = (this.f40268b.hashCode() + (Long.hashCode(this.f40267a) * 31)) * 31;
                    int i11 = 0;
                    String str = this.f40269c;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i12 = (hashCode4 + hashCode) * 31;
                    Integer num = this.f40270d;
                    if (num == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = num.hashCode();
                    }
                    int i13 = (i12 + hashCode2) * 31;
                    String str2 = this.f40271e;
                    if (str2 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = str2.hashCode();
                    }
                    int i14 = (i13 + hashCode3) * 31;
                    Integer num2 = this.f40272f;
                    if (num2 != null) {
                        i11 = num2.hashCode();
                    }
                    return i14 + i11;
                }

                public final String toString() {
                    return "LibraryCategoryScreen(userId=" + this.f40267a + ", taskType=" + this.f40268b + ", contentId=" + this.f40269c + ", missionId=" + this.f40270d + ", relatedProgramTaskId=" + this.f40271e + ", filterId=" + this.f40272f + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ d(int i11, long j5, TaskType taskType, String str, Integer num, String str2, Integer num2) {
                    super(0);
                    if (3 != (i11 & 3)) {
                        PluginExceptionsKt.throwMissingFieldException(i11, 3, C0531a.f40273a.getDescriptor());
                    }
                    this.f40267a = j5;
                    this.f40268b = taskType;
                    if ((i11 & 4) == 0) {
                        this.f40269c = null;
                    } else {
                        this.f40269c = str;
                    }
                    if ((i11 & 8) == 0) {
                        this.f40270d = null;
                    } else {
                        this.f40270d = num;
                    }
                    if ((i11 & 16) == 0) {
                        this.f40271e = null;
                    } else {
                        this.f40271e = str2;
                    }
                    if ((i11 & 32) == 0) {
                        this.f40272f = null;
                    } else {
                        this.f40272f = num2;
                    }
                }
            }

            /* compiled from: ExploreTabActivity.kt */
            @kotlinx.serialization.Serializable
            /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0527a extends AbstractC0526a {
                public static final b Companion = new b(0);

                /* renamed from: i  reason: collision with root package name */
                private static final KSerializer<Object>[] f40249i = {null, null, EnumsKt.createSimpleEnumSerializer("com.withings.contentproviders.model.content.TaskType", TaskType.values()), null, null, null, null, null};

                /* renamed from: a  reason: collision with root package name */
                private final long f40250a;

                /* renamed from: b  reason: collision with root package name */
                private final String f40251b;

                /* renamed from: c  reason: collision with root package name */
                private final TaskType f40252c;

                /* renamed from: d  reason: collision with root package name */
                private final boolean f40253d;

                /* renamed from: e  reason: collision with root package name */
                private final Integer f40254e;

                /* renamed from: f  reason: collision with root package name */
                private final Integer f40255f;

                /* renamed from: g  reason: collision with root package name */
                private final Long f40256g;

                /* renamed from: h  reason: collision with root package name */
                private final String f40257h;

                /* compiled from: ExploreTabActivity.kt */
                /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0528a implements GeneratedSerializer<C0527a> {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C0528a f40258a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final /* synthetic */ PluginGeneratedSerialDescriptor f40259b;

                    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.internal.GeneratedSerializer, com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$a$a, java.lang.Object] */
                    static {
                        ?? obj = new Object();
                        f40258a = obj;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.healthplus.explore.ui.activity.ExploreTabActivity.Companion.StartDestination.ContentDetail", obj, 8);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.USER_ID, false);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.CONTENT_ID, false);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.TASK_TYPE, false);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.IS_COMPLETED, true);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.INSTANCE_ID, true);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.MISSION_ID, true);
                        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.PROGRAM_ID, true);
                        pluginGeneratedSerialDescriptor.addElement("relatedProgramTaskId", true);
                        f40259b = pluginGeneratedSerialDescriptor;
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer<?>[] childSerializers() {
                        KSerializer<?>[] kSerializerArr = C0527a.f40249i;
                        LongSerializer longSerializer = LongSerializer.INSTANCE;
                        StringSerializer stringSerializer = StringSerializer.INSTANCE;
                        KSerializer<?> kSerializer = kSerializerArr[2];
                        IntSerializer intSerializer = IntSerializer.INSTANCE;
                        return new KSerializer[]{longSerializer, stringSerializer, kSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
                    }

                    @Override // kotlinx.serialization.DeserializationStrategy
                    public final Object deserialize(Decoder decoder) {
                        boolean z5;
                        Long l5;
                        String str;
                        Integer num;
                        int i11;
                        String str2;
                        TaskType taskType;
                        Integer num2;
                        long j5;
                        kotlin.jvm.internal.u.j(decoder, "decoder");
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f40259b;
                        CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
                        KSerializer[] kSerializerArr = C0527a.f40249i;
                        int i12 = 4;
                        int i13 = 7;
                        if (beginStructure.decodeSequentially()) {
                            long decodeLongElement = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                            String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                            IntSerializer intSerializer = IntSerializer.INSTANCE;
                            taskType = (TaskType) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], null);
                            str2 = decodeStringElement;
                            num2 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, intSerializer, null);
                            z5 = decodeBooleanElement;
                            num = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, intSerializer, null);
                            str = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, StringSerializer.INSTANCE, null);
                            l5 = (Long) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, LongSerializer.INSTANCE, null);
                            i11 = 255;
                            j5 = decodeLongElement;
                        } else {
                            boolean z11 = true;
                            boolean z12 = false;
                            Long l6 = null;
                            String str3 = null;
                            Integer num3 = null;
                            long j11 = 0;
                            String str4 = null;
                            TaskType taskType2 = null;
                            Integer num4 = null;
                            int i14 = 0;
                            while (z11) {
                                int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                                switch (decodeElementIndex) {
                                    case -1:
                                        z11 = false;
                                        i12 = 4;
                                        i13 = 7;
                                        break;
                                    case 0:
                                        j11 = beginStructure.decodeLongElement(pluginGeneratedSerialDescriptor, 0);
                                        i14 |= 1;
                                        i12 = 4;
                                        i13 = 7;
                                        break;
                                    case 1:
                                        str4 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                                        i14 |= 2;
                                        i12 = 4;
                                        i13 = 7;
                                        break;
                                    case 2:
                                        taskType2 = (TaskType) beginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], taskType2);
                                        i14 |= 4;
                                        i12 = 4;
                                        i13 = 7;
                                        break;
                                    case 3:
                                        z12 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 3);
                                        i14 |= 8;
                                        break;
                                    case 4:
                                        num3 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i12, IntSerializer.INSTANCE, num3);
                                        i14 |= 16;
                                        break;
                                    case 5:
                                        num4 = (Integer) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, IntSerializer.INSTANCE, num4);
                                        i14 |= 32;
                                        break;
                                    case 6:
                                        l6 = (Long) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, LongSerializer.INSTANCE, l6);
                                        i14 |= 64;
                                        break;
                                    case 7:
                                        str3 = (String) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, i13, StringSerializer.INSTANCE, str3);
                                        i14 |= 128;
                                        break;
                                    default:
                                        throw new UnknownFieldException(decodeElementIndex);
                                }
                            }
                            z5 = z12;
                            l5 = l6;
                            str = str3;
                            num = num4;
                            i11 = i14;
                            str2 = str4;
                            taskType = taskType2;
                            num2 = num3;
                            j5 = j11;
                        }
                        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                        return new C0527a(i11, j5, str2, taskType, z5, num2, num, l5, str);
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
                    public final SerialDescriptor getDescriptor() {
                        return f40259b;
                    }

                    @Override // kotlinx.serialization.SerializationStrategy
                    public final void serialize(Encoder encoder, Object obj) {
                        C0527a value = (C0527a) obj;
                        kotlin.jvm.internal.u.j(encoder, "encoder");
                        kotlin.jvm.internal.u.j(value, "value");
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f40259b;
                        CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
                        C0527a.i(value, beginStructure, pluginGeneratedSerialDescriptor);
                        beginStructure.endStructure(pluginGeneratedSerialDescriptor);
                    }

                    @Override // kotlinx.serialization.internal.GeneratedSerializer
                    public final KSerializer<?>[] typeParametersSerializers() {
                        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
                    }
                }

                /* compiled from: ExploreTabActivity.kt */
                /* renamed from: com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a$a$b */
                /* loaded from: classes3.dex */
                public static final class b {
                    public /* synthetic */ b(int i11) {
                        this();
                    }

                    public final KSerializer<C0527a> serializer() {
                        return C0528a.f40258a;
                    }

                    private b() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0527a(long j5, String contentId, TaskType taskType, boolean z5, Integer num, String str, int i11) {
                    super(0);
                    z5 = (i11 & 8) != 0 ? false : z5;
                    num = (i11 & 32) != 0 ? null : num;
                    str = (i11 & 128) != 0 ? null : str;
                    kotlin.jvm.internal.u.j(contentId, "contentId");
                    kotlin.jvm.internal.u.j(taskType, "taskType");
                    this.f40250a = j5;
                    this.f40251b = contentId;
                    this.f40252c = taskType;
                    this.f40253d = z5;
                    this.f40254e = null;
                    this.f40255f = num;
                    this.f40256g = null;
                    this.f40257h = str;
                }

                public static final void i(C0527a c0527a, CompositeEncoder compositeEncoder, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
                    compositeEncoder.encodeLongElement(pluginGeneratedSerialDescriptor, 0, c0527a.f40250a);
                    compositeEncoder.encodeStringElement(pluginGeneratedSerialDescriptor, 1, c0527a.f40251b);
                    compositeEncoder.encodeSerializableElement(pluginGeneratedSerialDescriptor, 2, f40249i[2], c0527a.f40252c);
                    boolean shouldEncodeElementDefault = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3);
                    boolean z5 = c0527a.f40253d;
                    if (shouldEncodeElementDefault || z5) {
                        compositeEncoder.encodeBooleanElement(pluginGeneratedSerialDescriptor, 3, z5);
                    }
                    boolean shouldEncodeElementDefault2 = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4);
                    Integer num = c0527a.f40254e;
                    if (shouldEncodeElementDefault2 || num != null) {
                        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 4, IntSerializer.INSTANCE, num);
                    }
                    boolean shouldEncodeElementDefault3 = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 5);
                    Integer num2 = c0527a.f40255f;
                    if (shouldEncodeElementDefault3 || num2 != null) {
                        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 5, IntSerializer.INSTANCE, num2);
                    }
                    boolean shouldEncodeElementDefault4 = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 6);
                    Long l5 = c0527a.f40256g;
                    if (shouldEncodeElementDefault4 || l5 != null) {
                        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 6, LongSerializer.INSTANCE, l5);
                    }
                    boolean shouldEncodeElementDefault5 = compositeEncoder.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 7);
                    String str = c0527a.f40257h;
                    if (shouldEncodeElementDefault5 || str != null) {
                        compositeEncoder.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 7, StringSerializer.INSTANCE, str);
                    }
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final String a() {
                    return ContentScreenNavigation.Destinations.f40135c.a();
                }

                @Override // com.withings.healthplus.explore.ui.activity.ExploreTabActivity.a.AbstractC0526a
                public final long b() {
                    return this.f40250a;
                }

                public final String d() {
                    return this.f40251b;
                }

                public final Integer e() {
                    return this.f40255f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0527a)) {
                        return false;
                    }
                    C0527a c0527a = (C0527a) obj;
                    if (this.f40250a == c0527a.f40250a && kotlin.jvm.internal.u.e(this.f40251b, c0527a.f40251b) && this.f40252c == c0527a.f40252c && this.f40253d == c0527a.f40253d && kotlin.jvm.internal.u.e(this.f40254e, c0527a.f40254e) && kotlin.jvm.internal.u.e(this.f40255f, c0527a.f40255f) && kotlin.jvm.internal.u.e(this.f40256g, c0527a.f40256g) && kotlin.jvm.internal.u.e(this.f40257h, c0527a.f40257h)) {
                        return true;
                    }
                    return false;
                }

                public final String f() {
                    return this.f40257h;
                }

                public final TaskType g() {
                    return this.f40252c;
                }

                public final boolean h() {
                    return this.f40253d;
                }

                public final int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3;
                    int a11 = y1.a(this.f40253d, (this.f40252c.hashCode() + defpackage.d.c(this.f40251b, Long.hashCode(this.f40250a) * 31, 31)) * 31, 31);
                    int i11 = 0;
                    Integer num = this.f40254e;
                    if (num == null) {
                        hashCode = 0;
                    } else {
                        hashCode = num.hashCode();
                    }
                    int i12 = (a11 + hashCode) * 31;
                    Integer num2 = this.f40255f;
                    if (num2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = num2.hashCode();
                    }
                    int i13 = (i12 + hashCode2) * 31;
                    Long l5 = this.f40256g;
                    if (l5 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = l5.hashCode();
                    }
                    int i14 = (i13 + hashCode3) * 31;
                    String str = this.f40257h;
                    if (str != null) {
                        i11 = str.hashCode();
                    }
                    return i14 + i11;
                }

                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ContentDetail(userId=");
                    sb2.append(this.f40250a);
                    sb2.append(", contentId=");
                    sb2.append(this.f40251b);
                    sb2.append(", taskType=");
                    sb2.append(this.f40252c);
                    sb2.append(", isCompleted=");
                    sb2.append(this.f40253d);
                    sb2.append(", instanceId=");
                    sb2.append(this.f40254e);
                    sb2.append(", missionId=");
                    sb2.append(this.f40255f);
                    sb2.append(", programId=");
                    sb2.append(this.f40256g);
                    sb2.append(", relatedProgramTaskId=");
                    return y1.e(sb2, this.f40257h, ")");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C0527a(int i11, long j5, String str, TaskType taskType, boolean z5, Integer num, Integer num2, Long l5, String str2) {
                    super(0);
                    if (7 != (i11 & 7)) {
                        PluginExceptionsKt.throwMissingFieldException(i11, 7, C0528a.f40258a.getDescriptor());
                    }
                    this.f40250a = j5;
                    this.f40251b = str;
                    this.f40252c = taskType;
                    if ((i11 & 8) == 0) {
                        this.f40253d = false;
                    } else {
                        this.f40253d = z5;
                    }
                    if ((i11 & 16) == 0) {
                        this.f40254e = null;
                    } else {
                        this.f40254e = num;
                    }
                    if ((i11 & 32) == 0) {
                        this.f40255f = null;
                    } else {
                        this.f40255f = num2;
                    }
                    if ((i11 & 64) == 0) {
                        this.f40256g = null;
                    } else {
                        this.f40256g = l5;
                    }
                    if ((i11 & 128) == 0) {
                        this.f40257h = null;
                    } else {
                        this.f40257h = str2;
                    }
                }
            }
        }
    }

    /* compiled from: ExploreTabActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<vk.a, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(vk.a aVar) {
            vk.a newStateScreen = aVar;
            kotlin.jvm.internal.u.j(newStateScreen, "newStateScreen");
            ExploreTabActivity.E3(ExploreTabActivity.this).q0(newStateScreen);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ExploreTabActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            ExploreTabActivity exploreTabActivity = ExploreTabActivity.this;
            r8.n nVar = exploreTabActivity.f40243f;
            if (nVar != null) {
                if (!nVar.N()) {
                    exploreTabActivity.finish();
                }
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("navController");
            throw null;
        }
    }

    /* compiled from: ExploreTabActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        d() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1647825152, new k0(ExploreTabActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ExploreTabActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.q<vt.a, SuccessTaskInfo, Integer, nm0.y> {
        e() {
            super(3);
        }

        @Override // ym0.q
        public final nm0.y invoke(vt.a aVar, SuccessTaskInfo successTaskInfo, Integer num) {
            cr.a.a(new nm0.j(aVar, successTaskInfo), new l0(ExploreTabActivity.this, num));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class f implements bn0.d<Activity, a.AbstractC0526a> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f40285a = nm0.h.b(new m0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f40286b;

        public f(Activity activity) {
            this.f40286b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.healthplus.explore.ui.activity.ExploreTabActivity$a$a, java.lang.Object] */
        @Override // bn0.d
        public final a.AbstractC0526a getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f40285a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40287a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f40287a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f40287a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40288a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f40288a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f40288a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40289a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f40289a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f40289a.getDefaultViewModelCreationExtras();
        }
    }

    public static final a.AbstractC0526a D3(ExploreTabActivity exploreTabActivity) {
        exploreTabActivity.getClass();
        return (a.AbstractC0526a) exploreTabActivity.f40245h.getValue(exploreTabActivity, f40241m[0]);
    }

    public static final ExploreTabViewModel E3(ExploreTabActivity exploreTabActivity) {
        return (ExploreTabViewModel) exploreTabActivity.f40244g.getValue();
    }

    public static final void G3(ExploreTabActivity exploreTabActivity, Integer num, Long l5, SuccessTaskInfo successTaskInfo, vt.a aVar) {
        exploreTabActivity.getClass();
        ArrayList arrayList = new ArrayList();
        boolean z5 = false;
        long b10 = ((a.AbstractC0526a) exploreTabActivity.f40245h.getValue(exploreTabActivity, f40241m[0])).b();
        String d11 = aVar.d();
        String a11 = aVar.a();
        kotlin.jvm.internal.u.j(successTaskInfo, "successTaskInfo");
        Intent putExtra = new Intent(exploreTabActivity, CompletionActivity.class).putExtra(NavigationArguments.USER_ID, b10).putExtra("success_task_info", successTaskInfo).putExtra("identifier", d11).putExtra("content_id", a11).putExtra("program_id", l5).putExtra("measure_type", num);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        if (aVar.b()) {
            ch.d dVar = exploreTabActivity.f40242e;
            if (dVar != null) {
                dVar.r().getClass();
                Intent className = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(exploreTabActivity.getPackageName(), "com.withings.missions.ui.activity.DailyMissionsSuccessActivity");
                kotlin.jvm.internal.u.i(className, "setClassName(...)");
                arrayList.add(className);
            } else {
                kotlin.jvm.internal.u.s("intentBuilder");
                throw null;
            }
        }
        if (aVar.c()) {
            arrayList.add(putExtra);
        }
        Object[] array = arrayList.toArray(new Intent[0]);
        if (((Intent[]) array).length == 0) {
            z5 = true;
        }
        if (!(!z5)) {
            array = null;
        }
        Intent[] intentArr = (Intent[]) array;
        if (intentArr != null) {
            exploreTabActivity.startActivities(intentArr);
        }
        if (l5 != null) {
            r8.n nVar = exploreTabActivity.f40243f;
            if (nVar != null) {
                nVar.N();
                return;
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        }
        exploreTabActivity.finish();
    }

    @Override // com.withings.healthplus.explore.ui.activity.Hilt_ExploreTabActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 184942054, new d()));
    }
}
