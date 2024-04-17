package com.withings.programs.model.program;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: Sponsors.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"B9\b\u0011\u0012\u0006\u0010#\u001a\u00020\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b \u0010\r¨\u0006)"}, d2 = {"Lcom/withings/programs/model/program/Sponsors;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/program/Sponsors;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "component3", "name", HealthUserProfile.USER_PROFILE_KEY_IMAGE, HealthConstants.FoodInfo.DESCRIPTION, "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withings/programs/model/program/Sponsors;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getImage", "getDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class Sponsors {
    public static final Companion Companion = new Companion(null);
    @SerializedName(HealthConstants.FoodInfo.DESCRIPTION)
    private final String description;
    @SerializedName(HealthUserProfile.USER_PROFILE_KEY_IMAGE)
    private final String image;
    @SerializedName("name")
    private final String name;

    /* compiled from: Sponsors.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/program/Sponsors$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/program/Sponsors;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<Sponsors> serializer() {
            return Sponsors$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Sponsors(int i11, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, Sponsors$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.image = str2;
        this.description = str3;
    }

    public static /* synthetic */ Sponsors copy$default(Sponsors sponsors, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sponsors.name;
        }
        if ((i11 & 2) != 0) {
            str2 = sponsors.image;
        }
        if ((i11 & 4) != 0) {
            str3 = sponsors.description;
        }
        return sponsors.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$android_release(Sponsors sponsors, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, sponsors.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, sponsors.image);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, sponsors.description);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.image;
    }

    public final String component3() {
        return this.description;
    }

    public final Sponsors copy(String name, String image, String description) {
        u.j(name, "name");
        u.j(image, "image");
        u.j(description, "description");
        return new Sponsors(name, image, description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sponsors)) {
            return false;
        }
        Sponsors sponsors = (Sponsors) obj;
        if (u.e(this.name, sponsors.name) && u.e(this.image, sponsors.image) && u.e(this.description, sponsors.description)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.description.hashCode() + d.c(this.image, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.image;
        return y1.e(l0.b("Sponsors(name=", str, ", image=", str2, ", description="), this.description, ")");
    }

    public Sponsors(String name, String image, String description) {
        u.j(name, "name");
        u.j(image, "image");
        u.j(description, "description");
        this.name = name;
        this.image = image;
        this.description = description;
    }
}
