<#include "/include.html">
<!DOCTYPE html>
<html>


<!-- Mirrored from www.zi-han.net/theme/hplus/resource_tree.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:19:58 GMT -->
<head>

    <meta charset="utf-8">
    <meta text="viewport" content="width=device-width, initial-scale=1.0">

    <link href="<@s.url '/resource/css/bootstrap.min14ed.css?v=3.3.6'/>" rel="stylesheet">
    <link href="<@s.url '/resource/css/font-awesome.min93e3.css?v=4.4.0'/>" rel="stylesheet">
    <link href="<@s.url '/resource/css/animate.min.css'/>" rel="stylesheet">
    <link href="<@s.url '/resource/css/style.min862f.css?v=4.1.0'/>" rel="stylesheet">
    <link href="<@s.url '/resource/css/plugins/treeview/bootstrap-treeview.css'/>" rel="stylesheet">
</head>

<body class="gray-bg">
    <div class="row wrapper wrapper-content animated fadeInRight">
        <div class="col-sm-4">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>

                    </div>
                </div>
                <div class="ibox-content">
                    <div id="treeview12" class="test"></div>
                </div>
            </div>
        </div>
    </div>
    <script src="<@s.url '/resource/js/jquery.min.js?v=2.1.4'/>"></script>
    <script src="<@s.url '/resource/js/bootstrap.min.js?v=3.3.6'/>"></script>
    <script src="<@s.url '/resource/js/content.min.js?v=1.0.0'/>"></script>
    <script src="<@s.url '/resource/js/plugins/treeview/bootstrap-treeview.js'/>"></script>
    <script>
        var e=${rootNode!};
        $("#treeview12").treeview({
            data: e,
            showIcon: false,
            showCheckbox: true,
            onNodeChecked: function(event, node) {
               alert(node.text + ' was checked</p>');
            },
            onNodeUnchecked: function (event, node) {
                alert(node.text + ' was unchecked</p>');
            }
        });
    </script>
</body>


</html>
