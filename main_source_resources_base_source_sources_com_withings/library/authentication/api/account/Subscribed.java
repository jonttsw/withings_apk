package com.withings.library.authentication.api.account;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.api.account.serializers.BooleanSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: AccountContext.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BQ\b\u0000\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102Bc\b\u0017\u0012\u0006\u00103\u001a\u00020\u001d\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b1\u00106J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\fR\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\fR\"\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\fR\"\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\fR\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010#\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010\fR\"\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010#\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010\f¨\u00069"}, d2 = {"Lcom/withings/library/authentication/api/account/Subscribed;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/Subscribed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "component5", "component6", "discount", "newsletter", ConstantsWs.WELLNESS_TASK_TYPE_SURVEY, "study", "report", RemoteMessageConst.NOTIFICATION, "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/withings/library/authentication/api/account/Subscribed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getDiscount", "getDiscount$annotations", "()V", "getNewsletter", "getNewsletter$annotations", "getSurvey", "getSurvey$annotations", "getStudy", "getStudy$annotations", "getReport", "getReport$annotations", "getNotification", "getNotification$annotations", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class Subscribed {
    public static final Companion Companion = new Companion(null);
    private final Boolean discount;
    private final Boolean newsletter;
    private final Boolean notification;
    private final Boolean report;
    private final Boolean study;
    private final Boolean survey;

    /* compiled from: AccountContext.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/Subscribed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/Subscribed;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<Subscribed> serializer() {
            return Subscribed$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Subscribed() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 63, (m) null);
    }

    public static /* synthetic */ Subscribed copy$default(Subscribed subscribed, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = subscribed.discount;
        }
        if ((i11 & 2) != 0) {
            bool2 = subscribed.newsletter;
        }
        Boolean bool7 = bool2;
        if ((i11 & 4) != 0) {
            bool3 = subscribed.survey;
        }
        Boolean bool8 = bool3;
        if ((i11 & 8) != 0) {
            bool4 = subscribed.study;
        }
        Boolean bool9 = bool4;
        if ((i11 & 16) != 0) {
            bool5 = subscribed.report;
        }
        Boolean bool10 = bool5;
        if ((i11 & 32) != 0) {
            bool6 = subscribed.notification;
        }
        return subscribed.copy(bool, bool7, bool8, bool9, bool10, bool6);
    }

    public static final /* synthetic */ void write$Self(Subscribed subscribed, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subscribed.discount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, subscribed.discount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subscribed.newsletter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, subscribed.newsletter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subscribed.survey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, subscribed.survey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subscribed.study != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, subscribed.study);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subscribed.report != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, subscribed.report);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subscribed.notification != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, subscribed.notification);
        }
    }

    public final Boolean component1() {
        return this.discount;
    }

    public final Boolean component2() {
        return this.newsletter;
    }

    public final Boolean component3() {
        return this.survey;
    }

    public final Boolean component4() {
        return this.study;
    }

    public final Boolean component5() {
        return this.report;
    }

    public final Boolean component6() {
        return this.notification;
    }

    public final Subscribed copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        return new Subscribed(bool, bool2, bool3, bool4, bool5, bool6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subscribed)) {
            return false;
        }
        Subscribed subscribed = (Subscribed) obj;
        if (u.e(this.discount, subscribed.discount) && u.e(this.newsletter, subscribed.newsletter) && u.e(this.survey, subscribed.survey) && u.e(this.study, subscribed.study) && u.e(this.report, subscribed.report) && u.e(this.notification, subscribed.notification)) {
            return true;
        }
        return false;
    }

    public final Boolean getDiscount() {
        return this.discount;
    }

    public final Boolean getNewsletter() {
        return this.newsletter;
    }

    public final Boolean getNotification() {
        return this.notification;
    }

    public final Boolean getReport() {
        return this.report;
    }

    public final Boolean getStudy() {
        return this.study;
    }

    public final Boolean getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Boolean bool = this.discount;
        int i11 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i12 = hashCode * 31;
        Boolean bool2 = this.newsletter;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Boolean bool3 = this.survey;
        if (bool3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Boolean bool4 = this.study;
        if (bool4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool4.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Boolean bool5 = this.report;
        if (bool5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool5.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Boolean bool6 = this.notification;
        if (bool6 != null) {
            i11 = bool6.hashCode();
        }
        return i16 + i11;
    }

    public String toString() {
        Boolean bool = this.discount;
        Boolean bool2 = this.newsletter;
        Boolean bool3 = this.survey;
        Boolean bool4 = this.study;
        Boolean bool5 = this.report;
        Boolean bool6 = this.notification;
        return "Subscribed(discount=" + bool + ", newsletter=" + bool2 + ", survey=" + bool3 + ", study=" + bool4 + ", report=" + bool5 + ", notification=" + bool6 + ")";
    }

    public /* synthetic */ Subscribed(int i11, @Serializable(with = BooleanSerializer.class) Boolean bool, @Serializable(with = BooleanSerializer.class) Boolean bool2, @Serializable(with = BooleanSerializer.class) Boolean bool3, @Serializable(with = BooleanSerializer.class) Boolean bool4, @Serializable(with = BooleanSerializer.class) Boolean bool5, @Serializable(with = BooleanSerializer.class) Boolean bool6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i11 & 1) == 0) {
            this.discount = null;
        } else {
            this.discount = bool;
        }
        if ((i11 & 2) == 0) {
            this.newsletter = null;
        } else {
            this.newsletter = bool2;
        }
        if ((i11 & 4) == 0) {
            this.survey = null;
        } else {
            this.survey = bool3;
        }
        if ((i11 & 8) == 0) {
            this.study = null;
        } else {
            this.study = bool4;
        }
        if ((i11 & 16) == 0) {
            this.report = null;
        } else {
            this.report = bool5;
        }
        if ((i11 & 32) == 0) {
            this.notification = null;
        } else {
            this.notification = bool6;
        }
    }

    public Subscribed(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.discount = bool;
        this.newsletter = bool2;
        this.survey = bool3;
        this.study = bool4;
        this.report = bool5;
        this.notification = bool6;
    }

    public /* synthetic */ Subscribed(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : bool3, (i11 & 8) != 0 ? null : bool4, (i11 & 16) != 0 ? null : bool5, (i11 & 32) != 0 ? null : bool6);
    }

    @Serializable(with = BooleanSerializer.class)
    public static /* synthetic */ void getDiscount$annotations() {
    }

    @Serializable(with = BooleanSerializer.class)
    public static /* synthetic */ void getNewsletter$annotations() {
    }

    @Serializable(with = BooleanSerializer.class)
    public static /* synthetic */ void getNotification$annotations() {
    }

    @Serializable(with = BooleanSerializer.class)
    public static /* synthetic */ void getReport$annotations() {
    }

    @Serializable(with = BooleanSerializer.class)
    public static /* synthetic */ void getStudy$annotations() {
    }

    @Serializable(with = BooleanSerializer.class)
    public static /* synthetic */ void getSurvey$annotations() {
    }
}
