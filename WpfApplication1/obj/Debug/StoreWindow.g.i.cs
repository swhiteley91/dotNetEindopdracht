﻿#pragma checksum "..\..\StoreWindow.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "079E772ACBE1C06AF27B2222C2549F28"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.34209
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace WpfApplication1 {
    
    
    /// <summary>
    /// StoreWindow
    /// </summary>
    public partial class StoreWindow : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 5 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Grid StoreWindowLayoutRoot;
        
        #line default
        #line hidden
        
        
        #line 6 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label loggedinLabel;
        
        #line default
        #line hidden
        
        
        #line 7 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label usernameLabel;
        
        #line default
        #line hidden
        
        
        #line 8 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.ListBox inventoryListBox;
        
        #line default
        #line hidden
        
        
        #line 10 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.ListBox productsListBox;
        
        #line default
        #line hidden
        
        
        #line 12 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label saldoLabel;
        
        #line default
        #line hidden
        
        
        #line 13 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label saldoAmountLabel;
        
        #line default
        #line hidden
        
        
        #line 14 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button BuyButton;
        
        #line default
        #line hidden
        
        
        #line 15 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button RefreshButton;
        
        #line default
        #line hidden
        
        
        #line 16 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox volumeTextbox;
        
        #line default
        #line hidden
        
        
        #line 17 "..\..\StoreWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label volumeLabel;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/WpfApplication1;component/storewindow.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\StoreWindow.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.StoreWindowLayoutRoot = ((System.Windows.Controls.Grid)(target));
            return;
            case 2:
            this.loggedinLabel = ((System.Windows.Controls.Label)(target));
            return;
            case 3:
            this.usernameLabel = ((System.Windows.Controls.Label)(target));
            return;
            case 4:
            this.inventoryListBox = ((System.Windows.Controls.ListBox)(target));
            return;
            case 5:
            this.productsListBox = ((System.Windows.Controls.ListBox)(target));
            
            #line 10 "..\..\StoreWindow.xaml"
            this.productsListBox.SelectionChanged += new System.Windows.Controls.SelectionChangedEventHandler(this.productsListBox_SelectionChanged);
            
            #line default
            #line hidden
            return;
            case 6:
            this.saldoLabel = ((System.Windows.Controls.Label)(target));
            return;
            case 7:
            this.saldoAmountLabel = ((System.Windows.Controls.Label)(target));
            return;
            case 8:
            this.BuyButton = ((System.Windows.Controls.Button)(target));
            
            #line 14 "..\..\StoreWindow.xaml"
            this.BuyButton.Click += new System.Windows.RoutedEventHandler(this.BuyButton_Click);
            
            #line default
            #line hidden
            return;
            case 9:
            this.RefreshButton = ((System.Windows.Controls.Button)(target));
            
            #line 15 "..\..\StoreWindow.xaml"
            this.RefreshButton.Click += new System.Windows.RoutedEventHandler(this.RefreshButton_Click);
            
            #line default
            #line hidden
            return;
            case 10:
            this.volumeTextbox = ((System.Windows.Controls.TextBox)(target));
            return;
            case 11:
            this.volumeLabel = ((System.Windows.Controls.Label)(target));
            return;
            }
            this._contentLoaded = true;
        }
    }
}

