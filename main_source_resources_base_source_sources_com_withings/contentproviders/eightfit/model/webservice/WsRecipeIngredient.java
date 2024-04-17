package com.withings.contentproviders.eightfit.model.webservice;

import androidx.camera.camera2.internal.k0;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.content.EightFitRecipeContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsRecipeContent.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001e\u0010\u001fB/\b\u0011\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001d\u0010\r¨\u0006&"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeIngredient;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeIngredient;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "name", "replacement", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeIngredient;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getReplacement", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsRecipeIngredient {
    public static final Companion Companion = new Companion(null);
    @SerializedName("name")
    private final String name;
    @SerializedName("replacement")
    private final String replacement;

    /* compiled from: WsRecipeContent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\t"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeIngredient$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecipeIngredient;", "toEntity", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitRecipeContent$Companion$EightFitRecipeIngredient;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsRecipeIngredient> serializer() {
            return WsRecipeIngredient$$serializer.INSTANCE;
        }

        public final List<EightFitRecipeContent.Companion.EightFitRecipeIngredient> toEntity(List<WsRecipeIngredient> list) {
            u.j(list, "<this>");
            List<WsRecipeIngredient> list2 = list;
            ArrayList arrayList = new ArrayList(x.y(list2, 10));
            for (WsRecipeIngredient wsRecipeIngredient : list2) {
                arrayList.add(new EightFitRecipeContent.Companion.EightFitRecipeIngredient(wsRecipeIngredient.getName(), wsRecipeIngredient.getReplacement()));
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsRecipeIngredient(int i11, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i11 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 3, WsRecipeIngredient$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.replacement = str2;
    }

    public static /* synthetic */ WsRecipeIngredient copy$default(WsRecipeIngredient wsRecipeIngredient, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsRecipeIngredient.name;
        }
        if ((i11 & 2) != 0) {
            str2 = wsRecipeIngredient.replacement;
        }
        return wsRecipeIngredient.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsRecipeIngredient wsRecipeIngredient, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsRecipeIngredient.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, wsRecipeIngredient.replacement);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.replacement;
    }

    public final WsRecipeIngredient copy(String name, String str) {
        u.j(name, "name");
        return new WsRecipeIngredient(name, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsRecipeIngredient)) {
            return false;
        }
        WsRecipeIngredient wsRecipeIngredient = (WsRecipeIngredient) obj;
        if (u.e(this.name, wsRecipeIngredient.name) && u.e(this.replacement, wsRecipeIngredient.replacement)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getReplacement() {
        return this.replacement;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.name.hashCode() * 31;
        String str = this.replacement;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return k0.c("WsRecipeIngredient(name=", this.name, ", replacement=", this.replacement, ")");
    }

    public WsRecipeIngredient(String name, String str) {
        u.j(name, "name");
        this.name = name;
        this.replacement = str;
    }
}
