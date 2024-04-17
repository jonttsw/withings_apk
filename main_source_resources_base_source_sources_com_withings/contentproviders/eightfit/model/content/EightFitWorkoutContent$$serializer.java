package com.withings.contentproviders.eightfit.model.content;

import com.samsung.android.sdk.healthdata.HealthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: EightFitWorkoutContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EightFitWorkoutContent$$serializer implements GeneratedSerializer<EightFitWorkoutContent> {
    public static final EightFitWorkoutContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EightFitWorkoutContent$$serializer eightFitWorkoutContent$$serializer = new EightFitWorkoutContent$$serializer();
        INSTANCE = eightFitWorkoutContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.content.EightFitWorkoutContent", eightFitWorkoutContent$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.FoodInfo.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("prepareItems", false);
        pluginGeneratedSerialDescriptor.addElement("video", false);
        pluginGeneratedSerialDescriptor.addElement("hlsVideo", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedDevices", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EightFitWorkoutContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = EightFitWorkoutContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, access$get$childSerializers$cp[1], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, access$get$childSerializers$cp[5], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), access$get$childSerializers$cp[8]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EightFitWorkoutContent deserialize(Decoder decoder) {
        int i11;
        List list;
        String str;
        List list2;
        String str2;
        String str3;
        List list3;
        String str4;
        String str5;
        String str6;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = EightFitWorkoutContent.access$get$childSerializers$cp();
        int i12 = 7;
        int i13 = 6;
        String str7 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 6);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 8, access$get$childSerializers$cp[8], null);
            str3 = decodeStringElement;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            str6 = decodeStringElement4;
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            str5 = decodeStringElement3;
            str4 = decodeStringElement2;
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, access$get$childSerializers$cp[5], null);
            i11 = 511;
            list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, access$get$childSerializers$cp[1], null);
        } else {
            boolean z5 = true;
            int i14 = 0;
            List list4 = null;
            String str8 = null;
            List list5 = null;
            String str9 = null;
            List list6 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i13 = 6;
                        break;
                    case 0:
                        str7 = beginStructure.decodeStringElement(descriptor2, 0);
                        i14 |= 1;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        list6 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, access$get$childSerializers$cp[1], list6);
                        i14 |= 2;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 2:
                        str10 = beginStructure.decodeStringElement(descriptor2, 2);
                        i14 |= 4;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 3:
                        str9 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str9);
                        i14 |= 8;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 4:
                        str11 = beginStructure.decodeStringElement(descriptor2, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        list5 = (List) beginStructure.decodeSerializableElement(descriptor2, 5, access$get$childSerializers$cp[5], list5);
                        i14 |= 32;
                        break;
                    case 6:
                        str12 = beginStructure.decodeStringElement(descriptor2, i13);
                        i14 |= 64;
                        break;
                    case 7:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i12, StringSerializer.INSTANCE, str8);
                        i14 |= 128;
                        break;
                    case 8:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, access$get$childSerializers$cp[8], list4);
                        i14 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i14;
            list = list4;
            str = str8;
            list2 = list5;
            str2 = str9;
            str3 = str7;
            list3 = list6;
            str4 = str10;
            str5 = str11;
            str6 = str12;
        }
        beginStructure.endStructure(descriptor2);
        return new EightFitWorkoutContent(i11, str3, list3, str4, str2, str5, list2, str6, str, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, EightFitWorkoutContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        EightFitWorkoutContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
