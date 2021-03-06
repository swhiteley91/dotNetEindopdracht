﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace WcfServiceLibrary1
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "IService1" in both code and config file together.
    [ServiceContract, XmlSerializerFormat]
    public interface IPracticumService
    {
        [OperationContract]
        string Register(string username);

        [OperationContract]
        bool LogIn(string username, string password);

        [OperationContract]
        List<producten> getProducts(string username, string password);

        [OperationContract]
        string BuyProduct(string username, string password, int productId, int volume);

        [OperationContract]
        List<UserProductDTO> GetPurchases(string username, string password);

        [OperationContract]
        double? GetSaldo(string username, string password);
    }
}
