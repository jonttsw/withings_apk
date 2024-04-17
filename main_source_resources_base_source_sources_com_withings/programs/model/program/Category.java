package com.withings.programs.model.program;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: Category.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"B9\b\u0011\u0012\u0006\u0010#\u001a\u00020\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b \u0010\r¨\u0006)"}, d2 = {"Lcom/withings/programs/model/program/Category;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/program/Category;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "component3", "identifier", "iconId", "title", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withings/programs/model/program/Category;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getIconId", "getTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class Category {
    public static final Companion Companion = new Companion(null);
    @SerializedName("icon_id")
    private final String iconId;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("title")
    private final String title;

    /* compiled from: Category.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/program/Category$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/program/Category;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<Category> serializer() {
            return Category$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Category(int i11, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, Category$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.iconId = str2;
        this.title = str3;
    }

    public static /* synthetic */ Category copy$default(Category category, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = category.identifier;
        }
        if ((i11 & 2) != 0) {
            str2 = category.iconId;
        }
        if ((i11 & 4) != 0) {
            str3 = category.title;
        }
        return category.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$android_release(Category category, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, category.identifier);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, category.iconId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, category.title);
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.iconId;
    }

    public final String component3() {
        return this.title;
    }

    public final Category copy(String identifier, String iconId, String title) {
        u.j(identifier, "identifier");
        u.j(iconId, "iconId");
        u.j(title, "title");
        return new Category(identifier, iconId, title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        if (u.e(this.identifier, category.identifier) && u.e(this.iconId, category.iconId) && u.e(this.title, category.title)) {
            return true;
        }
        return false;
    }

    public final String getIconId() {
        return this.iconId;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + d.c(this.iconId, this.identifier.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.iconId;
        return y1.e(l0.b("Category(identifier=", str, ", iconId=", str2, ", title="), this.title, ")");
    }

    public Category(String identifier, String iconId, String title) {
        u.j(identifier, "identifier");
        u.j(iconId, "iconId");
        u.j(title, "title");
        this.identifier = identifier;
        this.iconId = iconId;
        this.title = title;
    }
}
