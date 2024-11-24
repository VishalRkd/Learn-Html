package com.spawn.learnhtml;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);

        TextView topicInfo = findViewById(R.id.topicInfo);
        String topicName = getIntent().getStringExtra("topic_name");


        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(topicName);

        }

        switch (topicName) {
            case "Introduction to HTML":
                topicInfo.setText(android.text.Html.fromHtml(
                        "HTML, or <b>HyperText Markup Language</b>, is the foundational language used for creating and designing web pages and applications. As a markup language, HTML enables developers to structure content by marking elements with 'tags' that define the role and formatting of text, images, multimedia, and other content on the web page. The term <b>'HyperText'</b> refers to the system of linking between different pages, allowing users to navigate across related content seamlessly.<br><br>" +

                                "HTML documents begin with the <b>&lt;!DOCTYPE html&gt;</b> declaration, which informs browsers of the document type and ensures consistent rendering across devices. The primary structure of an HTML page is divided into several essential tags:<br><br>" +

                                "1. <b>Root &lt;html&gt; tag</b>: This is the top-level element that encompasses all other elements on the page.<br>" +
                                "2. <b>&lt;head&gt; section</b>: Found at the beginning of an HTML document, the &lt;head&gt; contains metadata about the page, such as the title (&lt;title&gt; tag), character set (&lt;meta charset='UTF-8'&gt;), and links to external resources like stylesheets and scripts.<br>" +
                                "3. <b>&lt;body&gt; section</b>: The &lt;body&gt; contains the main visible content that users interact with, such as text, images, links, and forms.<br><br>" +

                                "HTML includes various structural tags like headings (&lt;h1&gt; through &lt;h6&gt;), paragraphs (&lt;p&gt;), and containers (&lt;div&gt;, &lt;span&gt;) that organize content into sections and blocks. <b>Headings</b> create a hierarchical structure for page content, making it easy for both users and search engines to understand the topic of each section. <b>Paragraphs</b> are used to display blocks of text, while div and span tags allow for grouping elements and applying styling or JavaScript functionality to selected sections.<br><br>" +

                                "Additional features of HTML include lists (&lt;ul&gt; for unordered lists, &lt;ol&gt; for ordered lists, and &lt;li&gt; for list items), which are essential for organizing items or steps. <b>Images</b> are embedded with the &lt;img&gt; tag, using the <b>src</b> attribute to specify the file path and the <b>alt</b> attribute for accessibility purposes. <b>Links</b>, created with the &lt;a&gt; tag, enable navigation across pages by setting the <b>href</b> attribute to the desired URL. HTML5 introduced multimedia elements like &lt;audio&gt; and &lt;video&gt;, allowing media to be embedded directly on the page, enhancing user engagement without relying on external plugins.<br><br>" +

                                "Modern HTML also supports semantic elements introduced in HTML5, such as &lt;header&gt;, &lt;footer&gt;, &lt;section&gt;, &lt;article&gt;, and &lt;nav&gt;. These tags convey the meaning of different parts of a webpage, improving accessibility and SEO (search engine optimization). For instance, &lt;header&gt; typically contains introductory content like logos or navigation links, while &lt;footer&gt; contains information like copyright notices and contact links.<br><br>" +

                                "In summary, HTML forms the backbone of web content, providing structure, organization, and accessibility. It is continuously evolving to include new features that enhance both functionality and user experience, making it an indispensable tool for web developers."
                ));
                break;

            case "HTML Structure and Basic Tags":
                topicInfo.setText(android.text.Html.fromHtml(
                        "HTML structure consists of several essential elements that provide the basic framework for a web page. Below are the key elements that make up an HTML document.<br><br>" +

                                "<b>&lt;!DOCTYPE html&gt;</b>: This declaration defines the document type and is required at the very beginning of an HTML document. It tells the browser which version of HTML the page is written in, ensuring that the page is rendered correctly.<br><br>" +

                                "<b>&lt;html&gt;</b>: The root element of the HTML document. It wraps all other elements on the page, and defines the document as an HTML document.<br><br>" +

                                "<b>&lt;head&gt;</b>: This section of the HTML document contains metadata, including the title of the page and links to external resources such as stylesheets or scripts. The <b>&lt;head&gt;</b> tag does not display content on the page, but provides important information to the browser.<br><br>" +

                                "<b>&lt;title&gt;</b>: Defines the title of the page, which appears in the browser tab.<br>" +
                                "<b>&lt;meta&gt;</b>: Provides metadata such as the character set (e.g., &lt;meta charset='UTF-8'&gt;) or the viewport settings for responsive web design.<br>" +
                                "<b>&lt;link&gt;</b>: Links to external resources such as CSS stylesheets or icons for the webpage.<br>" +
                                "<b>&lt;style&gt;</b>: Used to define internal CSS for styling the page.<br>" +
                                "<b>&lt;script&gt;</b>: Defines internal JavaScript that can be used to add interactivity to the page.<br><br>" +

                                "<b>&lt;body&gt;</b>: The body element contains all the visible content of the page. Everything that appears on the page, including text, images, links, forms, and other interactive elements, is placed inside the <b>&lt;body&gt;</b> tag.<br><br>" +

                                "<b>Basic HTML tags:</b><br>" +
                                "<b>&lt;h1&gt; to &lt;h6&gt;</b>: Headings that define the hierarchy of content. <b>&lt;h1&gt;</b> is the most important heading, typically used for the main title, while <b>&lt;h6&gt;</b> is used for the smallest headings.<br>" +
                                "<b>&lt;p&gt;</b>: Defines a paragraph of text.<br>" +
                                "<b>&lt;a&gt;</b>: Creates a hyperlink to another web page or external resource. The <b>href</b> attribute specifies the target URL.<br>" +
                                "<b>&lt;img&gt;</b>: Embeds an image on the page. The <b>src</b> attribute specifies the image file path, while the <b>alt</b> attribute provides an alternative text description for accessibility.<br>" +
                                "<b>&lt;ul&gt;</b>: Defines an unordered list. List items are created with the <b>&lt;li&gt;</b> tag.<br>" +
                                "<b>&lt;ol&gt;</b>: Defines an ordered list. Like <b>&lt;ul&gt;</b>, list items are created with the <b>&lt;li&gt;</b> tag, but the list items are numbered instead of bullet-pointed.<br>" +
                                "<b>&lt;div&gt;</b>: A division or container element used to group other HTML elements together. It's often used to apply CSS styling or JavaScript functionality to a section of the page.<br>" +
                                "<b>&lt;span&gt;</b>: A container element used for grouping inline elements, such as text, for styling or scripting.<br>" +
                                "<b>&lt;form&gt;</b>: Defines a form that collects user input. This element can contain text fields, buttons, checkboxes, and other input types.<br>" +
                                "<b>&lt;input&gt;</b>: Defines a single input field within a form, such as text input, radio buttons, checkboxes, or buttons.<br>" +
                                "<b>&lt;button&gt;</b>: Defines a clickable button within a form or elsewhere in the page.<br>" +
                                "<b>&lt;label&gt;</b>: Defines a label for an <b>&lt;input&gt;</b> element.<br>" +
                                "<b>&lt;select&gt;</b>: Defines a dropdown list of options. The <b>&lt;option&gt;</b> tag is used to define each choice within the list.<br>" +
                                "<b>&lt;textarea&gt;</b>: Defines a multi-line text input field within a form.<br>" +
                                "<b>&lt;table&gt;</b>: Defines a table. The <b>&lt;tr&gt;</b> tag defines rows, and the <b>&lt;td&gt;</b> tag defines table cells.<br>" +
                                "<b>&lt;thead&gt;</b>, <b>&lt;tbody&gt;</b>, <b>&lt;tfoot&gt;</b>: Group table rows into the head, body, and foot sections of the table.<br>" +
                                "<b>&lt;th&gt;</b>: Defines a table header cell, usually bold and centered.<br>" +
                                "<b>&lt;code&gt;</b>: Defines inline code snippets.<br>" +
                                "<b>&lt;pre&gt;</b>: Defines preformatted text, preserving spaces and line breaks.<br>" +
                                "<b>&lt;iframe&gt;</b>: Embeds an external webpage or media, such as a video, within the page.<br><br>" +

                                "These basic tags create the structure and layout of an HTML document. By combining and nesting these tags, developers can build complex, interactive web pages. Understanding these elements is fundamental to web development, as they form the backbone of every website and web application."
                ));
                break;

            case "Text Elements and Formatting":
                topicInfo.setText(android.text.Html.fromHtml(
                        "Text formatting in HTML is essential for styling and organizing text on web pages. Below are the key tags used to format text, making it more readable and structured.<br><br>" +

                                "<b>&lt;b&gt;</b> and <b>&lt;strong&gt;</b>: These tags are used to make text bold. The <b>&lt;b&gt;</b> tag is used for styling purposes, while <b>&lt;strong&gt;</b> also indicates importance, which can improve accessibility and SEO.<br><br>" +

                                "<b>&lt;i&gt;</b> and <b>&lt;em&gt;</b>: These tags are used for italicizing text. The <b>&lt;i&gt;</b> tag is primarily for visual styling, while <b>&lt;em&gt;</b> conveys emphasis, often with an audible change in tone when read aloud, and it can also improve SEO.<br><br>" +

                                "<b>&lt;u&gt;</b>: The underline tag, <b>&lt;u&gt;</b>, is used to underline text. Although it was traditionally used for indicating links, it is now used for general text styling.<br><br>" +

                                "<b>&lt;sup&gt;</b> and <b>&lt;sub&gt;</b>: These tags are used for superscript and subscript text, respectively. <b>&lt;sup&gt;</b> is typically used for exponents, footnotes, and mathematical formulas, while <b>&lt;sub&gt;</b> is used for subscripts, such as in chemical formulas.<br><br>" +

                                "<b>&lt;blockquote&gt;</b>: The <b>&lt;blockquote&gt;</b> tag is used to define a block of text that is a quotation. It is often indented to differentiate it from other content. This tag is typically used for long quotes or citations.<br><br>" +

                                "<b>&lt;mark&gt;</b>: Highlights text. The content inside <b>&lt;mark&gt;</b> is usually displayed with a yellow background, often used to indicate search terms or important information.<br><br>" +

                                "<b>&lt;del&gt;</b> and <b>&lt;ins&gt;</b>: The <b>&lt;del&gt;</b> tag is used to mark text as deleted (usually shown with a strikethrough), while <b>&lt;ins&gt;</b> is used for inserted text, typically underlined.<br><br>" +

                                "<b>&lt;small&gt;</b>: The <b>&lt;small&gt;</b> tag is used to reduce the text size, often used for fine print or disclaimers.<br><br>" +

                                "<b>&lt;abbr&gt;</b>: Defines an abbreviation or acronym. The <b>title</b> attribute can be added to provide the full form of the abbreviation when the user hovers over it.<br><br>" +

                                "<b>&lt;cite&gt;</b>: Defines a citation. This tag is used to reference the title of a creative work, such as a book, movie, or article.<br><br>" +

                                "<b>&lt;q&gt;</b>: Defines a short inline quotation. This tag is typically used for quoting small excerpts of text directly in a sentence.<br><br>" +

                                "<b>&lt;code&gt;</b>: Defines inline code snippets. It is typically used to display short pieces of code or commands.<br><br>" +

                                "<b>&lt;pre&gt;</b>: Defines preformatted text. The text inside <b>&lt;pre&gt;</b> is displayed exactly as typed, preserving spaces, line breaks, and formatting.<br><br>" +

                                "These text formatting elements help structure and style content in a way that is easy to read, visually appealing, and semantically meaningful. Proper use of these tags improves both the user experience and accessibility of the web page."
                ));
                break;

            case "HTML Lists":
                topicInfo.setText(android.text.Html.fromHtml(
                        "HTML provides several types of lists that help organize content in a structured way. These lists improve readability and allow for clear categorization of information.<br><br>" +

                                "<b>&lt;ol&gt;</b>: The ordered list tag (<b>&lt;ol&gt;</b>) is used for creating numbered lists. Each item in the list is defined with the <b>&lt;li&gt;</b> tag. Ordered lists are useful when the sequence of items is important, such as steps in a process or ranking items.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;ol&gt;<br>" +
                                "&lt;li&gt;First item&lt;/li&gt;<br>" +
                                "&lt;li&gt;Second item&lt;/li&gt;<br>" +
                                "&lt;/ol&gt;" +
                                "</pre><br>" +

                                "<b>&lt;ul&gt;</b>: The unordered list tag (<b>&lt;ul&gt;</b>) is used to create bullet-point lists. Items in unordered lists are also defined with the <b>&lt;li&gt;</b> tag. These lists are used when the order of items does not matter, such as listing features or ingredients.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;ul&gt;<br>" +
                                "&lt;li&gt;Item 1&lt;/li&gt;<br>" +
                                "&lt;li&gt;Item 2&lt;/li&gt;<br>" +
                                "&lt;/ul&gt;" +
                                "</pre><br>" +

                                "<b>&lt;dl&gt;</b>: The description list tag (<b>&lt;dl&gt;</b>) is used for defining a list of terms and their descriptions. The <b>&lt;dt&gt;</b> tag is used to define the term, and the <b>&lt;dd&gt;</b> tag is used for the description of the term. This list type is particularly useful for glossaries or FAQs.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;dl&gt;<br>" +
                                "&lt;dt&gt;HTML&lt;/dt&gt;<br>" +
                                "&lt;dd&gt;A markup language used for creating web pages&lt;/dd&gt;<br>" +
                                "&lt;/dl&gt;" +
                                "</pre><br>" +

                                "<b>Nested Lists</b>: Lists can also be nested within each other to create more complex structures. You can place an ordered or unordered list inside another list to organize content in multiple levels.<br><br>" +

                                "Example of nested lists:<br>" +
                                "<pre>" +
                                "&lt;ul&gt;<br>" +
                                "&lt;li&gt;Item 1&lt;/li&gt;<br>" +
                                "&lt;li&gt;Item 2&lt;/li&gt;<br>" +
                                "&lt;ul&gt;<br>" +
                                "&lt;li&gt;Nested Item A&lt;/li&gt;<br>" +
                                "&lt;li&gt;Nested Item B&lt;/li&gt;<br>" +
                                "&lt;/ul&gt;<br>" +
                                "&lt;/ul&gt;" +
                                "</pre><br>" +

                                "In summary, HTML lists allow you to present items in an organized and structured way, whether they need to be ordered, unordered, or presented as terms and descriptions. Proper use of lists improves readability, organization, and accessibility of content on web pages."
                ));
                break;

            case "Links and Navigation":
                topicInfo.setText(android.text.Html.fromHtml(
                        "Links are a fundamental part of web development, enabling navigation between different pages or resources. They are created using the <b>&lt;a&gt;</b> (anchor) tag. The <b>&lt;a&gt;</b> tag defines a hyperlink, and the <b>href</b> attribute specifies the destination of the link.<br><br>" +

                                "<b>&lt;a&gt;</b> tag: The <b>&lt;a&gt;</b> tag is used to create a clickable link. The most important attribute of the <b>&lt;a&gt;</b> tag is the <b>href</b> (hypertext reference), which defines the destination of the link. The content inside the <b>&lt;a&gt;</b> tag (usually text) is what users will click to navigate.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;a href='https://www.example.com'&gt;Visit Example Site&lt;/a&gt;" +
                                "</pre><br>" +

                                "In this example, the link text 'Visit Example Site' will take users to 'https://www.example.com' when clicked.<br><br>" +

                                "<b>Linking to External Websites</b>: Links can point to external websites by providing the full URL (Uniform Resource Locator) in the <b>href</b> attribute.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;a href='https://www.example.com'&gt;Go to Example&lt;/a&gt;" +
                                "</pre><br>" +

                                "<b>Linking to Internal Pages</b>: Links can also point to other pages within the same website or project. For internal navigation, the <b>href</b> attribute can be set to the relative URL of the page.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;a href='/about.html'&gt;About Us&lt;/a&gt;" +
                                "</pre><br>" +

                                "<b>Mailto Links</b>: You can create links that open the user's default email client and pre-fill an email address using the <b>mailto:</b> scheme in the <b>href</b> attribute.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;a href='mailto:someone@example.com'&gt;Send Email&lt;/a&gt;" +
                                "</pre><br>" +

                                "<b>Phone Links</b>: Similarly, you can create links that initiate a phone call by using the <b>tel:</b> scheme in the <b>href</b> attribute.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;a href='tel:+1234567890'&gt;Call Us&lt;/a&gt;" +
                                "</pre><br>" +

                                "<b>Link Targeting</b>: By default, links open in the same window or tab. You can change this behavior by using the <b>target</b> attribute. For example, setting <b>target='_blank'</b> will open the link in a new tab or window.<br><br>" +

                                "Example:<br>" +
                                "<pre>" +
                                "&lt;a href='https://www.example.com' target='_blank'&gt;Open in New Tab&lt;/a&gt;" +
                                "</pre><br>" +

                                "<b>Navigation</b>: Links are essential for creating navigation menus and enabling users to move between different sections of a website. Using <b>&lt;a&gt;</b> tags inside navigation elements like <b>&lt;nav&gt;</b> allows you to create structured and accessible menus.<br><br>" +

                                "Example of a simple navigation menu:<br>" +
                                "<pre>" +
                                "&lt;nav&gt;<br>" +
                                "&lt;a href='/home.html'&gt;Home&lt;/a&gt;<br>" +
                                "&lt;a href='/about.html'&gt;About&lt;/a&gt;<br>" +
                                "&lt;a href='/contact.html'&gt;Contact&lt;/a&gt;<br>" +
                                "&lt;/nav&gt;" +
                                "</pre><br>" +

                                "In summary, links are crucial for web navigation, connecting users to other pages, resources, or actions such as sending emails or making calls. They enable an interactive and dynamic web experience, allowing users to seamlessly navigate between content."
                ));
                break;

            case "Images and Media":
                topicInfo.setText(android.text.Html.fromHtml(
                        "In HTML, images and multimedia content are essential for enhancing the visual appeal and interactivity of a webpage. These elements are added using specific HTML tags designed for each type of media.<br><br>" +

                                "<b>Images</b>: The <b>&lt;img&gt;</b> tag is used to embed images in a web page. The most important attribute of the <b>&lt;img&gt;</b> tag is <b>src</b> (source), which specifies the path to the image file. The <b>alt</b> attribute is used for accessibility, providing a text description of the image for screen readers or when the image is not loaded.<br><br>" +

                                "Example of embedding an image:<br>" +
                                "<pre>" +
                                "&lt;img src='image.jpg' alt='Description of image' /&gt;" +
                                "</pre><br>" +

                                "In this example, the image located at 'image.jpg' will be displayed, and if it's unavailable or for accessibility reasons, the text 'Description of image' will be shown.<br><br>" +

                                "<b>Image Attributes</b>: The <b>&lt;img&gt;</b> tag supports several attributes that allow you to control how images are displayed:<br>" +
                                "<ul>" +
                                "<li><b>width</b>: Sets the width of the image (in pixels or percentage).</li>" +
                                "<li><b>height</b>: Sets the height of the image (in pixels or percentage).</li>" +
                                "<li><b>alt</b>: Provides a text description of the image for accessibility.</li>" +
                                "</ul><br>" +

                                "Example of using width and height attributes:<br>" +
                                "<pre>" +
                                "&lt;img src='image.jpg' alt='A scenic view' width='300' height='200' /&gt;" +
                                "</pre><br>" +

                                "<b>HTML5 Multimedia: Audio and Video</b>: HTML5 introduced new elements for embedding multimedia content such as <b>&lt;audio&gt;</b> and <b>&lt;video&gt;</b>. These tags allow you to seamlessly include audio and video files in your web page without relying on external plugins like Flash.<br><br>" +

                                "<b>Audio</b>: The <b>&lt;audio&gt;</b> tag is used to embed audio files, such as music or sound effects, directly into a webpage. It supports several attributes such as <b>controls</b>, which adds a player interface for playback.<br><br>" +

                                "Example of embedding an audio file:<br>" +
                                "<pre>" +
                                "&lt;audio controls&gt;" +
                                "&lt;source src='audio.mp3' type='audio/mp3' /&gt;" +
                                "&lt;/audio&gt;" +
                                "</pre><br>" +

                                "<b>Video</b>: The <b>&lt;video&gt;</b> tag is used to embed video files into a webpage. Like the audio element, it also supports the <b>controls</b> attribute, which provides play/pause buttons and volume control.<br><br>" +

                                "Example of embedding a video file:<br>" +
                                "<pre>" +
                                "&lt;video controls&gt;" +
                                "&lt;source src='video.mp4' type='video/mp4' /&gt;" +
                                "&lt;/video&gt;" +
                                "</pre><br>" +

                                "<b>Supported File Types</b>: For both audio and video, it's essential to use the correct file format that is supported by web browsers. Common audio formats include .mp3, .ogg, and .wav, while video formats include .mp4, .webm, and .ogg.<br><br>" +

                                "In summary, images, audio, and video are crucial for making a webpage interactive and engaging. HTML provides simple yet powerful tags for embedding these multimedia elements, enhancing the overall user experience on the web."
                ));
                break;

            case "Tables":
                topicInfo.setText(android.text.Html.fromHtml(
                        "In HTML, <b>tables</b> are used to organize data in rows and columns, providing a structured way to display information clearly. Tables are essential for displaying data in a grid format, such as for reports, schedules, and data analysis.<br><br>" +

                                "<b>The <table> Tag</b>: The <b>&lt;table&gt;</b> tag is used to create a table in HTML. It forms the container for all the rows and columns in the table.<br><br>" +

                                "Example of creating a table:<br>" +
                                "<pre>" +
                                "&lt;table&gt;" + "<br>" +
                                "&lt;/table&gt;" +
                                "</pre><br>" +

                                "<b>Core Table Elements</b>: To structure a table, you need the following tags:<br>" +
                                "<ul>" +
                                "<li><b>&lt;tr&gt;</b>: Represents a table row. Each row contains one or more cells.</li>" +
                                "<li><b>&lt;th&gt;</b>: Defines a table header cell. These cells are typically bold and centered, used to label columns or rows.</li>" +
                                "<li><b>&lt;td&gt;</b>: Represents a table data cell. This tag is used to contain the actual data in the table.</li>" +
                                "</ul><br>" +

                                "Example of a simple table with rows, headers, and data cells:<br>" +
                                "<pre>" +
                                "&lt;table&gt;<br>" +
                                "&lt;tr&gt;<br>" +
                                "&lt;th&gt;Header 1&lt;/th&gt;<br>" +
                                "&lt;th&gt;Header 2&lt;/th&gt;<br>" +
                                "&lt;/tr&gt;<br>" +
                                "&lt;tr&gt;<br>" +
                                "&lt;td&gt;Data 1&lt;/td&gt;<br>" +
                                "&lt;td&gt;Data 2&lt;/td&gt;<br>" +
                                "&lt;/tr&gt;<br>" +
                                "&lt;/table&gt;" +
                                "</pre><br>" +

                                "<b>Table Structure and Styling</b>: Tables can be further customized with additional attributes and CSS styles to enhance readability and design.<br>" +
                                "<ul>" +
                                "<li><b>border</b>: Adds a border around the table and its cells. Example: <i>&lt;table border='1'&gt;</i></li>" +
                                "<li><b>width</b>: Specifies the width of the table or individual columns. Example: <i>&lt;table width='50%'&gt;</i></li>" +
                                "<li><b>colspan</b>: Used to make a header or data cell span multiple columns. Example: <i>&lt;th colspan='2'&gt;Header&lt;/th&gt;</i></li>" +
                                "<li><b>rowspan</b>: Used to make a cell span multiple rows. Example: <i>&lt;td rowspan='2'&gt;Data&lt;/td&gt;</i></li>" +
                                "</ul><br>" +

                                "<b>Table Example with Styling</b>: A more advanced table with borders and column spanning:<br>" +
                                "<pre>" +
                                "&lt;table border='1'&gt;<br>" +
                                "&lt;tr&gt;<br>" +
                                "&lt;th colspan='2'&gt;Header 1&lt;/th&gt;<br>" +
                                "&lt;th&gt;Header 2&lt;/th&gt;<br>" +
                                "&lt;/tr&gt;<br>" +
                                "&lt;tr&gt;<br>" +
                                "&lt;td rowspan='2'&gt;Data 1&lt;/td&gt;<br>" +
                                "&lt;td&gt;Data 2&lt;/td&gt;<br>" +
                                "&lt;td&gt;Data 3&lt;/td&gt;<br>" +
                                "&lt;/tr&gt;<br>" +
                                "&lt;tr&gt;<br>" +
                                "&lt;td&gt;Data 4&lt;/td&gt;<br>" +
                                "&lt;td&gt;Data 5&lt;/td&gt;<br>" +
                                "&lt;/tr&gt;<br>" +
                                "&lt;/table&gt;" +
                                "</pre><br>" +

                                "<b>Accessibility and Tables</b>: When using tables for layout, it’s important to ensure that they are accessible. The use of <b>&lt;th&gt;</b> for headers and the <b>scope</b> attribute helps screen readers understand the structure of the table. Use <b>summary</b> and <b>caption</b> to describe complex tables for better accessibility.<br><br>" +

                                "In summary, tables are a powerful tool in HTML for displaying structured data. By using the right tags and attributes, you can create clear, organized tables that are both functional and visually appealing."
                ));
                break;

            case "Forms and Inputs":
                topicInfo.setText(android.text.Html.fromHtml(
                        "In HTML, <b>forms</b> are used to collect user input, allowing interaction with the website or web application. Forms consist of various input elements such as <b>&lt;input&gt;</b>, <b>&lt;textarea&gt;</b>, <b>&lt;select&gt;</b>, and <b>&lt;button&gt;</b>.<br><br>" +

                                "<b>The <form> Tag</b>: The <b>&lt;form&gt;</b> tag is used to define the beginning and end of a form. It contains all the input elements and buttons needed to collect data from the user. Forms also specify how data is submitted using the <b>action</b> and <b>method</b> attributes.<br><br>" +

                                "Example of a basic form structure:<br>" +
                                "<pre>" +
                                "&lt;form action='submit_data.php' method='POST'&gt;<br>" +
                                "&lt;/form&gt;" +
                                "</pre><br>" +

                                "<b>Input Elements</b>: The main elements used in forms are:<br>" +
                                "<ul>" +
                                "<li><b>&lt;input&gt;</b>: This tag is used for various types of input fields like text, email, password, checkboxes, radio buttons, and more. The <i>type</i> attribute defines the specific input type.</li>" +
                                "<li><b>&lt;textarea&gt;</b>: Used for multiline text input, such as comments or messages. Unlike <i>&lt;input&gt;</i>, which is for single-line input, <b>&lt;textarea&gt;</b> can span multiple lines.</li>" +
                                "<li><b>&lt;select&gt;</b>: This tag is used to create dropdown menus. Inside the <b>&lt;select&gt;</b> element, you use <b>&lt;option&gt;</b> tags to define the individual options available for selection.</li>" +
                                "<li><b>&lt;button&gt;</b>: Defines a button that can be clicked to submit the form or trigger JavaScript functions. Buttons are interactive elements that enable user actions.</li>" +
                                "</ul><br>" +

                                "<b>Example of a simple form with inputs:</b><br>" +
                                "<pre>" +
                                "&lt;form action='/submit' method='POST'&gt;<br>" +
                                "&lt;label for='name'&gt;Name:&lt;/label&gt;<br>" +
                                "&lt;input type='text' id='name' name='name' /&gt;<br><br>" +
                                "&lt;label for='email'&gt;Email:&lt;/label&gt;<br>" +
                                "&lt;input type='email' id='email' name='email' /&gt;<br><br>" +
                                "&lt;button type='submit'&gt;Submit&lt;/button&gt;<br>" +
                                "&lt;/form&gt;" +
                                "</pre><br>" +

                                "<b>Form Elements Attributes</b>: Input elements have several important attributes to customize their behavior and appearance:<br>" +
                                "<ul>" +
                                "<li><b>type</b>: Specifies the type of input, such as <i>text</i>, <i>password</i>, <i>radio</i>, <i>checkbox</i>, <i>email</i>, etc.</li>" +
                                "<li><b>placeholder</b>: Provides a hint or example text inside the input field that disappears when the user starts typing.</li>" +
                                "<li><b>value</b>: Sets the initial value for an input field, or the value to be sent when the form is submitted.</li>" +
                                "<li><b>required</b>: Specifies that the input field must be filled out before submitting the form.</li>" +
                                "<li><b>readonly</b>: Makes the input field uneditable, but the value can still be submitted.</li>" +
                                "</ul><br>" +

                                "<b>Form Submission</b>: Once a form is filled out, the data is typically submitted to a server using the <b>action</b> attribute (specifying where to send the form data) and the <b>method</b> attribute (specifying the HTTP method, such as GET or POST).<br>" +
                                "For example, a form that submits data using the POST method:<br>" +
                                "<pre>" +
                                "&lt;form action='submit_form.php' method='POST'&gt;" +
                                "&lt;/form&gt;" +
                                "</pre><br>" +

                                "In summary, forms are an essential part of web development, providing the mechanism to collect data from users, process it on the server, and perform various actions like user authentication, subscriptions, or feedback collection."
                ));
                break;

            case "HTML Attributes":
                topicInfo.setText(android.text.Html.fromHtml(
                        "In HTML, <b>attributes</b> provide additional information about elements. They define specific characteristics, styles, and behaviors for the elements they are associated with. Attributes are always written inside the opening tag of an element and are usually specified as <i>name-value pairs</i>.<br><br>" +

                                "<b>Common HTML Attributes</b>:<br>" +
                                "<ul>" +
                                "<li><b>id</b>: A unique identifier for an element. It allows for easy selection and manipulation with JavaScript and CSS.</li>" +
                                "<li><b>class</b>: Used to assign one or more classes to an element, making it easier to apply CSS styles or target multiple elements with JavaScript.</li>" +
                                "<li><b>href</b>: Specifies the destination URL for a link created with the <b>&lt;a&gt;</b> tag. It's used to navigate to another page or resource.</li>" +
                                "<li><b>src</b>: Specifies the source of an image or other embedded media (like audio or video) used in elements like <b>&lt;img&gt;</b>, <b>&lt;audio&gt;</b>, or <b>&lt;video&gt;</b>.</li>" +
                                "<li><b>alt</b>: Provides alternative text for an image when it cannot be displayed. It also improves accessibility by describing the image for screen readers.</li>" +
                                "<li><b>title</b>: Adds a tooltip to an element, which appears when the user hovers over the element.</li>" +
                                "<li><b>style</b>: Allows inline styling for an element, setting its visual appearance directly within the HTML code using CSS properties.</li>" +
                                "</ul><br>" +

                                "<b>Examples of HTML Attributes</b>:<br>" +
                                "1. <b>id</b> attribute: Sets a unique identifier for an element.<br>" +
                                "<pre>" +
                                "&lt;div id='container'&gt;Content goes here&lt;/div&gt;" +
                                "</pre><br>" +

                                "2. <b>class</b> attribute: Assigns one or more class names to an element.<br>" +
                                "<pre>" +
                                "&lt;p class='intro'&gt;This is an introduction paragraph.&lt;/p&gt;" +
                                "</pre><br>" +

                                "3. <b>href</b> attribute: Specifies the link destination for anchor tags.<br>" +
                                "<pre>" +
                                "&lt;a href='https://www.example.com'&gt;Visit Example&lt;/a&gt;" +
                                "</pre><br>" +

                                "4. <b>src</b> attribute: Sets the image source for the <b>&lt;img&gt;</b> tag.<br>" +
                                "<pre>" +
                                "&lt;img src='image.jpg' alt='A descriptive text' /&gt;" +
                                "</pre><br>" +

                                "5. <b>alt</b> attribute: Defines a text description for an image.<br>" +
                                "<pre>" +
                                "&lt;img src='image.jpg' alt='A beautiful sunset' /&gt;" +
                                "</pre><br>" +

                                "6. <b>title</b> attribute: Adds a tooltip that appears when hovering over an element.<br>" +
                                "<pre>" +
                                "&lt;a href='#' title='Click here for more information'&gt;More Info&lt;/a&gt;" +
                                "</pre><br>" +

                                "7. <b>style</b> attribute: Defines inline CSS to style an element directly.<br>" +
                                "<pre>" +
                                "&lt;div style='color: blue; font-size: 16px;'&gt;This text is blue and 16px in size.&lt;/div&gt;" +
                                "</pre><br>" +

                                "<b>Important Notes on HTML Attributes:</b><br>" +
                                "<ul>" +
                                "<li><b>Attributes are case-insensitive</b>: While HTML is not case-sensitive, it's a good practice to use lowercase for consistency.</li>" +
                                "<li><b>Attributes can be global or specific</b>: Some attributes like <b>id</b>, <b>class</b>, and <b>style</b> can be applied to almost all elements, while others like <b>href</b> are specific to certain elements (like <b>&lt;a&gt;</b>).</li>" +
                                "<li><b>Empty Attributes</b>: Some attributes, such as <b>disabled</b> or <b>checked</b>, do not require values and are simply written as the attribute name (e.g., <b>&lt;input disabled&gt;</b>).</li>" +
                                "</ul><br>" +

                                "<b>In Summary:</b> HTML attributes enhance the functionality of elements by providing additional properties like styling, identification, links, and behavior. They are essential for web design, user interaction, and accessibility."
                ));
                break;

            case "HTML5 Semantic Elements":
                topicInfo.setText(android.text.Html.fromHtml(
                        "HTML5 introduced <b>semantic elements</b> to enhance the structure and meaning of web pages. These elements provide clear meaning about the content they contain, making it easier for both users and search engines to understand the organization of the page. They also improve accessibility for screen readers and other assistive technologies.<br><br>" +

                                "<b>Key HTML5 Semantic Elements:</b><br>" +
                                "<ul>" +
                                "<li><b>&lt;header&gt;</b>: Represents the header section of a page or section. It typically contains introductory content like logos, navigation, or headings.</li>" +
                                "<li><b>&lt;footer&gt;</b>: Defines the footer section of a page or section. It often includes copyright information, contact details, and links to related content.</li>" +
                                "<li><b>&lt;nav&gt;</b>: Defines a navigation section, containing links to other pages or parts of the website. It helps users navigate through the site easily.</li>" +
                                "<li><b>&lt;article&gt;</b>: Represents a self-contained piece of content, like a blog post, news article, or any content that can be distributed independently.</li>" +
                                "<li><b>&lt;section&gt;</b>: Defines a section of content, often used for grouping related content within a page, such as a blog section or a chapter.</li>" +
                                "<li><b>&lt;aside&gt;</b>: Represents content that is tangentially related to the content around it, like a sidebar or a related link section.</li>" +
                                "</ul><br>" +

                                "<b>Benefits of Using Semantic Elements:</b><br>" +
                                "<ul>" +
                                "<li><b>Improved Accessibility</b>: By using meaningful elements, screen readers can better interpret the structure of a page, making it more accessible to users with disabilities.</li>" +
                                "<li><b>Better SEO (Search Engine Optimization)</b>: Semantic tags help search engines better understand the content of a page, improving its ranking.</li>" +
                                "<li><b>Enhanced Readability and Maintainability</b>: Semantic elements make the code easier to read and maintain, as developers can easily understand the purpose of each section.</li>" +
                                "<li><b>More Predictable Behavior</b>: Using semantic elements ensures consistent layout and behavior across different browsers and devices.</li>" +
                                "</ul><br>" +

                                "<b>Examples of HTML5 Semantic Elements:</b><br>" +
                                "1. <b>&lt;header&gt;</b> defines the top of the page or section:<br>" +
                                "<pre>" +
                                "&lt;header&gt;" +
                                "&lt;h1&gt;Welcome to My Website&lt;/h1&gt;" +
                                "&lt;nav&gt;" +
                                "&lt;a href='#home'&gt;Home&lt;/a&gt;" +
                                "&lt;a href='#about'&gt;About&lt;/a&gt;" +
                                "&lt;/nav&gt;" +
                                "&lt;/header&gt;" +
                                "</pre><br>" +

                                "2. <b>&lt;footer&gt;</b> defines the bottom section of the page:<br>" +
                                "<pre>" +
                                "&lt;footer&gt;" +
                                "&lt;p&gt;Copyright 2024 My Website&lt;/p&gt;" +
                                "&lt;/footer&gt;" +
                                "</pre><br>" +

                                "3. <b>&lt;nav&gt;</b> defines a navigation menu:<br>" +
                                "<pre>" +
                                "&lt;nav&gt;" +
                                "&lt;ul&gt;" +
                                "&lt;li&gt;&lt;a href='#home'&gt;Home&lt;/a&gt;&lt;/li&gt;" +
                                "&lt;li&gt;&lt;a href='#services'&gt;Services&lt;/a&gt;&lt;/li&gt;" +
                                "&lt;/ul&gt;" +
                                "&lt;/nav&gt;" +
                                "</pre><br>" +

                                "4. <b>&lt;article&gt;</b> defines a standalone piece of content like a blog post:<br>" +
                                "<pre>" +
                                "&lt;article&gt;" +
                                "&lt;h2&gt;HTML5: A New Era for Web Development&lt;/h2&gt;" +
                                "&lt;p&gt;HTML5 brings exciting new features to web development, improving both user experience and accessibility.&lt;/p&gt;" +
                                "&lt;/article&gt;" +
                                "</pre><br>" +

                                "5. <b>&lt;section&gt;</b> defines a section of content, such as a product category:<br>" +
                                "<pre>" +
                                "&lt;section&gt;" +
                                "&lt;h2&gt;Our Products&lt;/h2&gt;" +
                                "&lt;ul&gt;" +
                                "&lt;li&gt;Product 1&lt;/li&gt;" +
                                "&lt;li&gt;Product 2&lt;/li&gt;" +
                                "&lt;/ul&gt;" +
                                "&lt;/section&gt;" +
                                "</pre><br>" +

                                "6. <b>&lt;aside&gt;</b> defines content related to the main content, like a sidebar:<br>" +
                                "<pre>" +
                                "&lt;aside&gt;" +
                                "&lt;h3&gt;Related Articles&lt;/h3&gt;" +
                                "&lt;ul&gt;" +
                                "&lt;li&gt;How to Use HTML5&lt;/li&gt;" +
                                "&lt;li&gt;CSS3 and HTML5 Integration&lt;/li&gt;" +
                                "&lt;/ul&gt;" +
                                "&lt;/aside&gt;" +
                                "</pre><br>" +

                                "<b>In Summary:</b> HTML5 semantic elements provide a structured way to represent different parts of a webpage, improving accessibility, SEO, and overall web development efficiency. They enable developers to create more meaningful and organized web pages."
                ));
                break;

            case "HTML Block and Inline Elements":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>Block and Inline Elements</b> are fundamental concepts in HTML that define how elements behave in a webpage layout. Understanding these elements helps developers create well-structured and responsive web pages.<br><br>" +

                                "<b>Block Elements</b>:<br>" +
                                "Block elements take up the full width of their container and always start on a new line. They typically represent major sections of content. Some common block elements include:<br>" +
                                "<ul>" +
                                "<li><b>&lt;div&gt;</b>: Used for grouping and styling other elements.</li>" +
                                "<li><b>&lt;p&gt;</b>: Represents a paragraph of text.</li>" +
                                "<li><b>&lt;h1&gt; to &lt;h6&gt;</b>: Headings of various levels, from largest to smallest.</li>" +
                                "<li><b>&lt;ul&gt; &lt;ol&gt;</b>: Used for unordered and ordered lists.</li>" +
                                "<li><b>&lt;article&gt;</b>: Represents independent, self-contained content.</li>" +
                                "<li><b>&lt;section&gt;</b>: Represents a section of content within a page.</li>" +
                                "</ul><br>" +

                                "<b>Inline Elements</b>:<br>" +
                                "Inline elements only take up as much space as necessary and do not break the flow of content. They can appear within block-level elements and do not start on a new line. Some common inline elements include:<br>" +
                                "<ul>" +
                                "<li><b>&lt;span&gt;</b>: Used for styling small sections of text within a block.</li>" +
                                "<li><b>&lt;a&gt;</b>: Represents a hyperlink, allowing navigation between pages or resources.</li>" +
                                "<li><b>&lt;img&gt;</b>: Embeds an image within content without breaking the flow.</li>" +
                                "<li><b>&lt;strong&gt;</b> and <b>&lt;em&gt;</b>: Represent bold and italic text, respectively.</li>" +
                                "<li><b>&lt;abbr&gt;</b>: Defines an abbreviation or acronym.</li>" +
                                "</ul><br>" +

                                "<b>Block vs. Inline: Key Differences</b><br>" +
                                "<ul>" +
                                "<li><b>Block elements</b> start on a new line and stretch to fill the available width of their parent container.</li>" +
                                "<li><b>Inline elements</b> flow within the surrounding text and take up only as much width as they need.</li>" +
                                "<li><b>Block elements</b> can contain both inline and block elements, while <b>inline elements</b> can only contain other inline elements.</li>" +
                                "</ul><br>" +

                                "<b>Combining Block and Inline Elements:</b><br>" +
                                "You can combine block and inline elements to create flexible and responsive layouts. For instance, you can place inline elements like <b>&lt;span&gt;</b> and <b>&lt;a&gt;</b> inside block elements like <b>&lt;p&gt;</b> or <b>&lt;div&gt;</b> to apply styles or add interactivity.<br><br>" +

                                "<b>Example of Block and Inline Elements:</b><br>" +
                                "<pre>" +
                                "&lt;div&gt;" +
                                "&lt;h1&gt;Welcome to Our Website&lt;/h1&gt;" +
                                "&lt;p&gt;This is a <span style='color: blue;'>blue</span> text inside a paragraph.&lt;/p&gt;" +
                                "&lt;a href='#'&gt;Click here&lt;/a&gt; for more details." +
                                "&lt;/div&gt;" +
                                "</pre><br>" +

                                "<b>In Summary:</b> Block elements define the structure of the page, while inline elements define smaller parts of content within the structure. Both types of elements play a crucial role in web development, allowing for efficient content organization and styling."
                ));
                break;

            case "Multimedia (Audio and Video)":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>Multimedia in HTML</b> is made possible through the <b>&lt;audio&gt;</b> and <b>&lt;video&gt;</b> tags, which allow developers to embed multimedia content like sound and video directly in a webpage. These tags make it easy to add interactive elements for a richer user experience. Here's a deeper look at both tags and their features.<br><br>" +

                                "<b>&lt;audio&gt; Tag:</b><br>" +
                                "The <b>&lt;audio&gt;</b> tag is used to embed audio content such as music, podcasts, or sound effects. It supports multiple audio formats, like MP3, Ogg, and WAV. The <b>controls</b> attribute can be added to provide play, pause, and volume control directly within the browser.<br>" +
                                "Key attributes for <b>&lt;audio&gt;</b>:<br>" +
                                "<ul>" +
                                "<li><b>src</b>: Specifies the path to the audio file.</li>" +
                                "<li><b>controls</b>: Adds playback controls (play, pause, volume).</li>" +
                                "<li><b>autoplay</b>: Makes the audio start playing automatically when the page loads.</li>" +
                                "<li><b>loop</b>: Makes the audio file loop indefinitely.</li>" +
                                "<li><b>muted</b>: Starts the audio muted by default.</li>" +
                                "</ul><br>" +

                                "<b>Example of Audio:</b><br>" +
                                "<pre>" +
                                "&lt;audio controls&gt;" + "<br>" +
                                "&lt;source src='audio_file.mp3' type='audio/mp3'&gt;" + "<br>" +
                                "Your browser does not support the audio element." + "<br>" +
                                "&lt;/audio&gt;" +
                                "</pre><br>" +

                                "<b>&lt;video&gt; Tag:</b><br>" +
                                "The <b>&lt;video&gt;</b> tag is used to embed video content, such as movies, tutorials, or demonstrations. Just like the <b>&lt;audio&gt;</b> tag, it supports multiple formats, including MP4, WebM, and Ogg. Developers can include a <b>controls</b> attribute to give users the ability to control playback of the video.<br>" +
                                "Key attributes for <b>&lt;video&gt;</b>:<br>" +
                                "<ul>" +
                                "<li><b>src</b>: Specifies the path to the video file.</li>" +
                                "<li><b>controls</b>: Adds video playback controls (play, pause, volume, fullscreen).</li>" +
                                "<li><b>autoplay</b>: Makes the video start playing automatically.</li>" +
                                "<li><b>loop</b>: Makes the video loop indefinitely.</li>" +
                                "<li><b>muted</b>: Starts the video muted by default.</li>" +
                                "<li><b>poster</b>: Specifies an image to show before the video starts playing (preview image).</li>" +
                                "</ul><br>" +

                                "<b>Example of Video:</b><br>" +
                                "<pre>" +
                                "&lt;video controls&gt;" + "<br>" +
                                "&lt;source src='video_file.mp4' type='video/mp4'&gt;" + "<br>" +
                                "Your browser does not support the video element." + "<br>" +
                                "&lt;/video&gt;" +
                                "</pre><br>" +

                                "<b>Supported Formats:</b><br>" +
                                "The <b>&lt;audio&gt;</b> and <b>&lt;video&gt;</b> tags support different formats, and it's essential to consider cross-browser compatibility. Common formats include:<br>" +
                                "<ul>" +
                                "<li><b>MP3</b>: Common audio format.</li>" +
                                "<li><b>MP4</b>: Widely supported video format.</li>" +
                                "<li><b>WebM</b>: An open video format.</li>" +
                                "<li><b>Ogg</b>: Open multimedia format.</li>" +
                                "</ul><br>" +

                                "<b>In Summary:</b><br>" +
                                "The <b>&lt;audio&gt;</b> and <b>&lt;video&gt;</b> elements are powerful tools for embedding multimedia directly into HTML pages. These tags allow for smooth integration of interactive and accessible audio and video content, making websites more engaging."
                ));
                break;

            case "Canvas and SVG":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>Canvas and SVG in HTML</b> are essential for creating dynamic and interactive graphics directly within a web page. These two technologies allow developers to render visual content such as drawings, charts, and animations, enabling a more engaging user experience.<br><br>" +

                                "<b>&lt;canvas&gt; Tag:</b><br>" +
                                "The <b>&lt;canvas&gt;</b> tag is used to draw graphics on the fly using JavaScript. It provides a surface on which developers can render shapes, images, and other graphics in real-time, making it perfect for things like games, data visualizations, and interactive applications.<br>" +
                                "Key attributes for <b>&lt;canvas&gt;</b>:<br>" +
                                "<ul>" +
                                "<li><b>width</b>: Specifies the width of the canvas. If not provided, the default width is 300px.</li>" +
                                "<li><b>height</b>: Specifies the height of the canvas. The default height is 150px.</li>" +
                                "</ul><br>" +

                                "<b>Example of Canvas:</b><br>" +
                                "<pre>" +
                                "&lt;canvas id='myCanvas' width='500' height='500'&gt;" + "<br>" +
                                "Your browser does not support the canvas element." + "<br>" +
                                "&lt;/canvas&gt;" +
                                "</pre><br>" +

                                "<b>JavaScript Example for Canvas:</b><br>" +
                                "After creating a canvas element, you can use JavaScript to draw on it. Here's an example of drawing a rectangle:<br>" +
                                "<pre>" +
                                "var canvas = document.getElementById('myCanvas');<br>" +
                                "var ctx = canvas.getContext('2d');<br>" +
                                "ctx.fillStyle = 'blue';<br>" +
                                "ctx.fillRect(50, 50, 200, 100);" +
                                "</pre><br>" +

                                "<b>Common Uses of Canvas:</b><br>" +
                                "<ul>" +
                                "<li>Games and interactive graphics</li>" +
                                "<li>Data visualizations (charts, graphs)</li>" +
                                "<li>Animations and motion graphics</li>" +
                                "</ul><br>" +

                                "<b>Limitations of Canvas:</b><br>" +
                                "While the canvas element is powerful, it is a <i>bitmap-based</i> graphics system, meaning it doesn't scale well when resized. Also, once an image is drawn on the canvas, it cannot be easily modified or accessed like vector graphics.<br><br>" +

                                "<b>SVG (Scalable Vector Graphics):</b><br>" +
                                "SVG is a markup language for creating vector-based graphics. Unlike canvas, SVGs are scalable and retain their quality at any size, making them ideal for responsive web design. SVG is based on XML, which means it can be styled and manipulated via CSS and JavaScript.<br>" +
                                "Key features of SVG:<br>" +
                                "<ul>" +
                                "<li><b>Scalable</b>: SVG images are vector-based, meaning they are resolution-independent and scalable without losing quality.</li>" +
                                "<li><b>Text-based</b>: SVG files are stored in XML format, which makes them easy to edit with code editors.</li>" +
                                "<li><b>CSS and JavaScript</b>: SVG can be styled using CSS and manipulated with JavaScript, allowing for dynamic and interactive graphics.</li>" +
                                "</ul><br>" +

                                "<b>Example of SVG:</b><br>" +
                                "<pre>" +
                                "&lt;svg width='100' height='100'&gt;" + "<br>" +
                                "&lt;circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' /&gt;" + "<br>" +
                                "&lt;/svg&gt;" +
                                "</pre><br>" +

                                "<b>Common Uses of SVG:</b><br>" +
                                "<ul>" +
                                "<li>Icons and logos</li>" +
                                "<li>Diagrams and illustrations</li>" +
                                "<li>Animations (via CSS or JavaScript)</li>" +
                                "</ul><br>" +

                                "<b>Advantages of SVG over Canvas:</b><br>" +
                                "<ul>" +
                                "<li><b>Scalability</b>: SVG images retain high quality at any size.</li>" +
                                "<li><b>Interactivity</b>: SVG elements can be targeted with CSS and JavaScript for dynamic behaviors.</li>" +
                                "<li><b>Accessibility</b>: SVG content is accessible and can be indexed by search engines.</li>" +
                                "</ul><br>" +

                                "<b>In Summary:</b><br>" +
                                "Both <b>&lt;canvas&gt;</b> and <b>SVG</b> are powerful tools for creating graphics in HTML. <b>&lt;canvas&gt;</b> is perfect for dynamic, pixel-based content, while <b>SVG</b> is best suited for scalable, vector-based images that need to retain quality at any size."
                ));
                break;

            case "Meta Tags and SEO":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>Meta Tags and SEO</b> play a crucial role in web development, providing metadata that helps search engines and browsers understand and rank your web pages.<br><br>" +

                                "<b>Meta Tags</b>: Meta tags are HTML elements placed inside the <b>&lt;head&gt;</b> section of a webpage, and they contain important information about the page, such as description, keywords, author, and more.<br>" +
                                "They do not affect the visible content of a page but provide useful details for search engines, social media platforms, and browsers.<br><br>" +

                                "<b>Common Meta Tags:</b><br>" +
                                "<ul>" +
                                "<li><b>&lt;meta name='description' content='...'/&gt;</b>: Provides a brief description of the page, which is often displayed in search engine results.</li>" +
                                "<li><b>&lt;meta name='keywords' content='...'/&gt;</b>: Lists keywords that relate to the content of the page, helping search engines understand the focus of the page.</li>" +
                                "<li><b>&lt;meta name='author' content='...'/&gt;</b>: Specifies the author of the webpage. It’s more of an informational tag but can help search engines.</li>" +
                                "<li><b>&lt;meta name='viewport' content='...'/&gt;</b>: Controls the layout on mobile browsers, ensuring responsive design.</li>" +
                                "<li><b>&lt;meta http-equiv='X-UA-Compatible' content='IE=edge'/&gt;</b>: Ensures the page is rendered using the latest version of Internet Explorer.</li>" +
                                "</ul><br>" +

                                "<b>Example of Meta Tags:</b><br>" +
                                "<pre>" +
                                "&lt;meta name='description' content='This is a sample page about HTML meta tags.' /&gt;" + "<br>" +
                                "&lt;meta name='keywords' content='HTML, meta tags, SEO, web development' /&gt;" + "<br>" +
                                "&lt;meta name='author' content='John Doe' /&gt;" + "<br>" +
                                "&lt;meta name='viewport' content='width=device-width, initial-scale=1' /&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>SEO (Search Engine Optimization)</b>: SEO refers to the practice of optimizing a website to rank higher in search engine results. Meta tags are a key element in this process, providing search engines with critical information about the content of the page.<br>" +
                                "Effective use of meta tags improves a website's visibility and searchability on platforms like Google, Bing, and Yahoo.<br><br>" +

                                "<b>Important Meta Tags for SEO:</b><br>" +
                                "<ul>" +
                                "<li><b>Meta Description</b>: A concise description of the page content. Search engines may use this description as the page's snippet in search results.</li>" +
                                "<li><b>Meta Keywords</b>: Though less influential today, some search engines still consider these keywords to understand the focus of a page.</li>" +
                                "<li><b>Meta Robots</b>: Provides search engines with instructions on how to index a page, such as whether it should follow links or be indexed at all.</li>" +
                                "<li><b>Open Graph Tags</b>: Used by social media platforms like Facebook to control how content appears when shared, improving visibility on social media.</li>" +
                                "</ul><br>" +

                                "<b>Meta Robots Tag Example:</b><br>" +
                                "<pre>" +
                                "&lt;meta name='robots' content='index, follow' /&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>Open Graph Meta Tags for Social Media:</b><br>" +
                                "<ul>" +
                                "<li><b>&lt;meta property='og:title' content='Page Title'/&gt;</b>: The title of the page when shared on social media.</li>" +
                                "<li><b>&lt;meta property='og:description' content='Page Description'/&gt;</b>: The description of the page when shared on social media.</li>" +
                                "<li><b>&lt;meta property='og:image' content='image.jpg'/&gt;</b>: The image that will appear when the page is shared on social media.</li>" +
                                "</ul><br>" +

                                "<b>In Summary:</b><br>" +
                                "Meta tags are an integral part of both SEO and user experience, providing important data that helps search engines and browsers display your content accurately. Proper use of meta tags ensures better discoverability, visibility, and ranking in search engine results, while also improving the user experience on social media platforms."
                ));
                break;

            case "HTML APIs (e.g., Geolocation, Drag and Drop)":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML APIs (Application Programming Interfaces)</b> provide additional functionality to enhance the interactivity and usability of web applications. HTML5 introduced several powerful APIs that allow developers to create dynamic and responsive websites with more advanced features.<br><br>" +

                                "<b>1. Geolocation API</b>: The <b>Geolocation API</b> allows websites to access the user's geographical location. This is particularly useful for applications like maps, location-based services, and weather apps.<br>" +
                                "By using the <b>navigator.geolocation</b> object, developers can retrieve the user's latitude and longitude, and even track their movement in real time.<br>" +
                                "The Geolocation API asks the user for permission before accessing their location, ensuring privacy.<br><br>" +

                                "<b>Example of Geolocation API:</b><br>" +
                                "<pre>" +
                                "if (navigator.geolocation) {" + "<br>" +
                                "   navigator.geolocation.getCurrentPosition(function(position) {" + "<br>" +
                                "       var latitude = position.coords.latitude;" + "<br>" +
                                "       var longitude = position.coords.longitude;" + "<br>" +
                                "       console.log('Latitude: ' + latitude + ', Longitude: ' + longitude);" + "<br>" +
                                "   });" + "<br>" +
                                "} else {" + "<br>" +
                                "   console.log('Geolocation is not supported by this browser.');" + "<br>" +
                                "}" + "<br>" +
                                "</pre><br>" +

                                "<b>2. Drag and Drop API</b>: The <b>Drag and Drop API</b> allows developers to create interactive user interfaces where users can drag elements and drop them in specific locations on a webpage.<br>" +
                                "This API can be used to create rich, dynamic content, such as sortable lists, interactive games, and media galleries.<br>" +
                                "The drag-and-drop functionality is achieved using a combination of HTML attributes and JavaScript event handling.<br><br>" +

                                "<b>Example of Drag and Drop API:</b><br>" +
                                "<pre>" +
                                "&lt;div id='drag1' draggable='true' ondragstart='drag(event)'&gt;Drag me&lt;/div&gt;" + "<br>" +
                                "&lt;div id='div1' ondrop='drop(event)' ondragover='allowDrop(event)'&gt;Drop here&lt;/div&gt;" + "<br>" +
                                "function drag(ev) {" + "<br>" +
                                "    ev.dataTransfer.setData('text', ev.target.id);" + "<br>" +
                                "}"+ "<br>" +
                                "function allowDrop(ev) {" + "<br>" +
                                "    ev.preventDefault();" + "<br>" +
                                "}"+ "<br>" +
                                "function drop(ev) {" + "<br>" +
                                "    var data = ev.dataTransfer.getData('text');" + "<br>" +
                                "    ev.target.appendChild(document.getElementById(data));" + "<br>" +
                                "}" + "<br>" +
                                "</pre><br>" +

                                "<b>3. Web Storage API</b>: The <b>Web Storage API</b> allows websites to store data locally within the user's browser. It includes two main storage mechanisms:<br>" +
                                "<ul>" +
                                "<li><b>LocalStorage</b>: Stores data with no expiration date. The data remains even after the browser is closed.</li>" +
                                "<li><b>SessionStorage</b>: Stores data for the duration of the page session. The data is lost once the browser tab or window is closed.</li>" +
                                "</ul><br>" +
                                "This API is useful for saving user preferences, session data, or caching application data to enhance performance.<br><br>" +

                                "<b>Example of Web Storage API (LocalStorage):</b><br>" +
                                "<pre>" +
                                "localStorage.setItem('username', 'JohnDoe');" + "<br>" +
                                "var user = localStorage.getItem('username');" + "<br>" +
                                "console.log(user); // Output: JohnDoe" + "<br>" +
                                "</pre><br>" +

                                "<b>In Summary:</b><br>" +
                                "HTML5 APIs like Geolocation, Drag and Drop, and Web Storage provide additional functionality that greatly enhances the user experience on the web. These APIs enable developers to create more interactive, dynamic, and personalized websites that can track user location, allow for smooth interactions, and store data locally for better performance and user engagement."
                ));
                break;

            case "Accessibility in HTML":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>Accessibility</b> in HTML ensures that web content is usable by people with disabilities, including those with visual, auditory, and motor impairments. It aims to create an inclusive web where all users, regardless of their abilities, can access and interact with content. Accessible design benefits all users, including those with temporary impairments or those in challenging environments.<br><br>" +

                                "<b>1. Alt Text for Images:</b> The <b>alt attribute</b> is used to provide a text description of an image. This is essential for users who rely on screen readers to interpret visual content.<br>" +
                                "The alt text should describe the function or purpose of the image, ensuring that users with visual impairments understand the context of the image.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "&lt;img src='logo.png' alt='Company Logo'&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>2. ARIA Roles:</b> <b>ARIA (Accessible Rich Internet Applications)</b> roles are attributes that provide extra information to screen readers about the function of web elements. For example, ARIA roles can indicate if a button is a <b>menu</b>, <b>dialog</b>, or <b>link</b>, helping users navigate dynamic content.<br>" +
                                "ARIA attributes like <b>aria-label</b>, <b>aria-hidden</b>, and <b>aria-live</b> enhance accessibility by providing more context or hiding unnecessary elements from screen readers.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "&lt;button aria-label='Close'&gt;X&lt;/button&gt;" + "<br>" +
                                "&lt;div aria-live='polite'&gt;New content added&lt;/div&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>3. Semantic HTML:</b> Using <b>semantic elements</b> like <b>&lt;header&gt;</b>, <b>&lt;footer&gt;</b>, <b>&lt;article&gt;</b>, and <b>&lt;nav&gt;</b> helps structure the page meaningfully. These elements define the role of content sections, making it easier for screen readers to navigate and for search engines to index the page.<br>" +
                                "For example, the <b>&lt;nav&gt;</b> element indicates navigation links, while <b>&lt;article&gt;</b> is used for independent content like blog posts or news articles.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "&lt;header&gt;" + "<br>" +
                                "  &lt;h1&gt;Welcome to Our Website&lt;/h1&gt;" + "<br>" +
                                "&lt;/header&gt;" + "<br>" +
                                "&lt;nav&gt;" + "<br>" +
                                "  &lt;a href='/home'&gt;Home&lt;/a&gt;" + "<br>" +
                                "  &lt;a href='/about'&gt;About&lt;/a&gt;" + "<br>" +
                                "&lt;/nav&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>4. Keyboard Navigation:</b> Ensuring that all interactive elements can be accessed and controlled via keyboard is critical for users with motor disabilities. This includes providing focus indicators and ensuring the <b>tab order</b> is logical.<br>" +
                                "Use <b>tabindex</b> and appropriate <b>focus</b> management to ensure users can easily navigate forms, buttons, and links using keyboard commands.<br><br>" +

                                "<b>5. Color Contrast:</b> Sufficient contrast between text and background ensures that content is readable by users with low vision or color blindness. The <b>WCAG (Web Content Accessibility Guidelines)</b> recommend a contrast ratio of at least 4.5:1 for normal text and 3:1 for large text.<br><br>" +

                                "<b>6. Accessible Forms:</b> Forms should include <b>labels</b> for inputs and ensure proper field grouping. Use the <b>label</b> tag to associate form controls with their respective descriptions, which is crucial for screen readers.<br>" +
                                "Additionally, use <b>aria-describedby</b> to provide extra context or instructions to form elements.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "&lt;label for='username'&gt;Username&lt;/label&gt;" + "<br>" +
                                "&lt;input type='text' id='username' name='username'&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>In Summary:</b><br>" +
                                "Implementing accessibility in HTML is not only about ensuring that websites work for people with disabilities, but also improving the overall user experience for everyone. By using alt text, ARIA roles, semantic elements, and other accessibility practices, you create an inclusive, user-friendly web that everyone can navigate and enjoy."
                ));
                break;

            case "Responsive HTML Design":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>Responsive HTML Design</b> ensures that web pages display properly across a wide range of devices, from mobile phones to desktop computers. The goal is to create a fluid, adaptable layout that provides an optimal viewing experience on any screen size, without requiring horizontal scrolling or resizing. Responsive design relies on several techniques to make this happen:<br><br>" +

                                "<b>1. Flexible Layouts:</b> Use relative units such as <b>%</b>, <b>em</b>, and <b>rem</b> instead of fixed units like <b>px</b> for width, height, margins, and padding. This allows elements to adjust their size based on the viewport, ensuring they look great on any device.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "&lt;div style='width: 50%'&gt;This div takes up 50% of the available width.&lt;/div&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>2. Media Queries:</b> Media queries allow you to apply different styles depending on the screen size or device features. By setting breakpoints, you can create custom layouts for mobile, tablet, and desktop screens.<br>" +
                                "For instance, you might want to change the number of columns in a layout based on the width of the screen or hide certain elements on smaller screens to optimize space.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "@media (max-width: 768px) {" + "<br>" +
                                "  body { font-size: 14px; }" + "<br>" +
                                "  .container { width: 100%; }" + "<br>" +
                                "}" + "<br>" +
                                "</pre><br>" +

                                "<b>3. Responsive Images:</b> To ensure that images load optimally across different screen sizes and resolutions, use the <b>srcset</b> and <b>sizes</b> attributes in the <b>&lt;img&gt;</b> tag. This allows the browser to select the most appropriate image based on the device's screen resolution and size.<br>" +
                                "Additionally, using the <b>picture</b> element lets you provide multiple image sources for different display conditions.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "&lt;img srcset='image-small.jpg 500w, image-medium.jpg 1000w, image-large.jpg 2000w' " + "<br>" +
                                "     sizes='(max-width: 600px) 500px, 1000px' " + "<br>" +
                                "     src='image-medium.jpg'&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>4. Viewport Meta Tag:</b> The <b>viewport</b> meta tag controls the layout on mobile devices, ensuring the page scales appropriately. Setting it to <b>width=device-width</b> and <b>initial-scale=1</b> makes the page's width match the device's screen width, preventing zooming and horizontal scrolling.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "&lt;meta name='viewport' content='width=device-width, initial-scale=1'&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>5. Mobile-Friendly Navigation:</b> On smaller screens, consider using a <b>hamburger menu</b> or other compact navigation patterns. This reduces clutter and provides an easy-to-use menu that expands when clicked.<br>" +
                                "You can implement this behavior using JavaScript or CSS to toggle the visibility of navigation links.<br><br>" +

                                "<b>Example:</b><br>" +
                                "<pre>" +
                                "&lt;button class='hamburger-menu'&gt;☰&lt;/button&gt;" + "<br>" +
                                "&lt;nav class='nav-links'&gt; ... &lt;/nav&gt;" + "<br>" +
                                "</pre><br>" +

                                "<b>In Summary:</b><br>" +
                                "Responsive HTML design is crucial for modern web development, allowing websites to adapt to different screen sizes and provide an optimal user experience across all devices. By using flexible layouts, media queries, responsive images, and other techniques, you can create websites that are both mobile-friendly and easy to navigate."
                ));
                break;

            case "HTML Entities":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Entities</b> are used to represent special characters in HTML that may not be easily typed on a keyboard or could be confused with HTML tags. These entities are essential for displaying symbols, reserved characters, and accented letters correctly on web pages. HTML entities are represented by a special code that starts with an ampersand (&) and ends with a semicolon (;). Here's a breakdown of the most common HTML entities:<br><br>" +

                                "<b>1. Reserved Characters:</b> Certain characters in HTML have special meanings, such as <, >, and &. If you want to display them as text rather than their HTML function, you need to use entities.<br>" +
                                "<b>Examples:</b><br>" +
                                "&amp; = &amp;<br>" +
                                "&lt; = &lt;<br>" +
                                "&gt; = &gt;<br>" +
                                "<b>Explanation:</b><br>" +
                                "The ampersand (&) is used to represent the entity itself, while the less than (<) and greater than (>) symbols are reserved for HTML tags. Therefore, you must use &amp;, &lt;, and &gt; to display these symbols as text.<br><br>" +

                                "<b>2. Accented Characters:</b> HTML entities are also used for displaying accented or non-ASCII characters that may not be directly accessible on a standard keyboard.<br>" +
                                "<b>Examples:</b><br>" +
                                "&eacute; = é<br>" +
                                "&ntilde; = ñ<br>" +
                                "&uuml; = ü<br>" +
                                "<b>Explanation:</b><br>" +
                                "Entities like &eacute; and &ntilde; represent characters such as é and ñ, allowing web pages to display text in different languages correctly.<br><br>" +

                                "<b>3. Mathematical and Technical Symbols:</b> HTML entities are used to display mathematical symbols, currency symbols, and other special characters that are commonly used in technical contexts.<br>" +
                                "<b>Examples:</b><br>" +
                                "&plus; = +<br>" +
                                "&minus; = −<br>" +
                                "&euro; = €<br>" +
                                "<b>Explanation:</b><br>" +
                                "These entities help represent mathematical operators, currency symbols, and other technical symbols. For instance, &euro; is used to display the euro symbol (€).<br><br>" +

                                "<b>4. Special Characters in HTML:</b> Some characters must always be encoded to avoid conflicts with HTML syntax.<br>" +
                                "<b>Examples:</b><br>" +
                                "&quot; = \" (double quote)<br>" +
                                "&apos; = ' (apostrophe)<br>" +
                                "<b>Explanation:</b><br>" +
                                "The double quote (\"), apostrophe ('), and other similar characters are treated as part of HTML syntax, so using entities ensures they appear correctly in text.<br><br>" +

                                "<b>5. How to Use HTML Entities:</b> To use HTML entities, simply replace the character you want to display with the corresponding entity code. For instance, instead of typing an ampersand (&), you can write &amp; to display it on the page. Similarly, if you want to include less than or greater than signs, use &lt; and &gt; respectively.<br><br>" +

                                "<b>In Summary:</b><br>" +
                                "HTML entities are essential for ensuring that special characters, symbols, and non-standard text are displayed correctly in a web document. By using the appropriate entity codes, you can represent characters that would otherwise be interpreted as HTML tags or symbols with special meanings."
                ));
                break;

            case "Web Storage":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>Web Storage</b> provides a mechanism for storing data on the user's browser, offering more flexibility and security than traditional cookies. Web Storage comes in two types: <b>localStorage</b> and <b>sessionStorage</b>. These two options enable developers to store key-value pairs of data without the need to interact with the server, improving performance and user experience.<br><br>" +

                                "<b>1. localStorage:</b> Data stored in localStorage persists across browser sessions. It remains available even after the browser is closed and reopened. This makes it ideal for storing long-term data, such as user preferences, settings, or other non-sensitive information.<br>" +
                                "<b>Example:</b><br>" +
                                "localStorage.setItem('username', 'JohnDoe');<br>" +
                                "const user = localStorage.getItem('username');<br>" +
                                "<b>Explanation:</b><br>" +
                                "In this example, the username 'JohnDoe' is stored in the localStorage and can be retrieved even after the browser is closed and reopened. The data is stored persistently unless explicitly removed.<br><br>" +

                                "<b>2. sessionStorage:</b> sessionStorage is similar to localStorage, but the data is only available for the duration of the page session. This means the data is cleared when the browser tab is closed or when the session ends. sessionStorage is useful for temporary data storage, such as during a single session or for storing form data that only needs to persist for the current session.<br>" +
                                "<b>Example:</b><br>" +
                                "sessionStorage.setItem('sessionId', 'abc123');<br>" +
                                "const session = sessionStorage.getItem('sessionId');<br>" +
                                "<b>Explanation:</b><br>" +
                                "In this case, the session ID 'abc123' is stored in sessionStorage and will only be accessible as long as the browser tab is open. Once the tab is closed, the data is cleared.<br><br>" +

                                "<b>3. Key Features of Web Storage:</b><br>" +
                                "<b>- Larger Storage Capacity:</b> Web Storage provides a significantly larger storage capacity than cookies. Typically, cookies are limited to around 4 KB, whereas localStorage and sessionStorage can store up to 5-10 MB of data depending on the browser.<br>" +
                                "<b>- More Secure:</b> Web Storage is not sent with every HTTP request, unlike cookies. This makes it more secure and less prone to exposure during requests.<br>" +
                                "<b>- No Expiration Time:</b> Data stored in localStorage does not have an expiration date unless it is manually cleared, unlike cookies which can have a specific expiration time.<br><br>" +

                                "<b>4. Usage Considerations:</b><br>" +
                                "<b>- Persistence:</b> Choose localStorage for data that needs to persist across sessions (e.g., saving user settings or preferences). Use sessionStorage for data that only needs to be available during the current session (e.g., temporary form data or authentication tokens).<br>" +
                                "<b>- Security:</b> Although Web Storage is more secure than cookies, it is still vulnerable to cross-site scripting (XSS) attacks. Sensitive information, such as passwords or credit card details, should never be stored in Web Storage.<br>" +
                                "<b>- Browser Support:</b> Web Storage is supported by all modern browsers, but always check compatibility when targeting older browsers.<br><br>" +

                                "<b>In Summary:</b><br>" +
                                "Web Storage allows developers to store data in the browser more efficiently and securely than with cookies. By using localStorage and sessionStorage, developers can store large amounts of data, improving performance and user experience without compromising security."
                ));
                break;


            case "HTML Global Attributes":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Global Attributes</b> are attributes that can be applied to almost any HTML element, regardless of the type of element. These attributes provide additional functionality or behavior to elements. They are useful for controlling the behavior and appearance of HTML elements in a consistent manner across a page.<br><br>" +

                                "Some of the most commonly used global attributes include:<br><br>" +

                                "1. <b>id</b>: The <i>id</i> attribute provides a unique identifier for an element within a page. It is used for referencing the element in CSS styles or JavaScript code, making it possible to interact with or style specific elements. The value of the <b>id</b> attribute must be unique within a page.<br>" +
                                "Example: <code>&lt;div id='header'&gt;</code><br><br>" +

                                "2. <b>class</b>: The <i>class</i> attribute is used to assign one or more class names to an element, which can then be used to apply styles via CSS or to target the element in JavaScript. Unlike the <b>id</b> attribute, multiple elements can share the same class.<br>" +
                                "Example: <code>&lt;p class='intro'&gt;</code><br><br>" +

                                "3. <b>style</b>: The <i>style</i> attribute allows you to apply inline CSS directly to an element. While this is not recommended for large-scale styling, it can be useful for applying quick, one-off styles.<br>" +
                                "Example: <code>&lt;div style='color: red;'&gt;</code><br><br>" +

                                "4. <b>title</b>: The <i>title</i> attribute provides additional information about an element when the user hovers over it. This text is typically displayed as a tooltip.<br>" +
                                "Example: <code>&lt;a title='Click here for more info'&gt;</code><br><br>" +

                                "5. <b>lang</b>: The <i>lang</i> attribute specifies the language of the content in an element. This helps search engines and browsers interpret the content correctly and is important for accessibility purposes.<br>" +
                                "Example: <code>&lt;html lang='en'&gt;</code><br><br>" +

                                "6. <b>dir</b>: The <i>dir</i> attribute defines the directionality of the text within an element. The two possible values are 'ltr' (left-to-right) and 'rtl' (right-to-left). It is particularly useful for languages like Arabic and Hebrew that are written from right to left.<br>" +
                                "Example: <code>&lt;p dir='rtl'&gt;</code><br><br>" +

                                "7. <b>data-* attributes</b>: These are custom attributes that allow you to store extra data on any HTML element. They are useful for storing information that JavaScript can use later without affecting the layout or behavior of the page.<br>" +
                                "Example: <code>&lt;div data-user='123'&gt;</code><br><br>" +

                                "8. <b>hidden</b>: The <i>hidden</i> attribute is a Boolean attribute that indicates that the element should not be rendered or is hidden from view. This attribute can be used to hide elements on a page, such as buttons or images, and can be toggled using JavaScript.<br>" +
                                "Example: <code>&lt;div hidden&gt;</code><br><br>" +

                                "9. <b>accesskey</b>: The <i>accesskey</i> attribute provides a shortcut key to activate or focus an element. This is useful for improving accessibility, particularly for users with disabilities.<br>" +
                                "Example: <code>&lt;a accesskey='S'&gt;Submit&lt;/a&gt;</code><br><br>" +

                                "10. <b>tabindex</b>: The <i>tabindex</i> attribute specifies the order in which elements are focused when the user presses the 'Tab' key. This is particularly important for creating a logical and accessible navigation flow.<br>" +
                                "Example: <code>&lt;button tabindex='1'&gt;</code><br><br>" +

                                "These global attributes can be applied to various HTML elements, such as <code>&lt;div&gt;</code>, <code>&lt;span&gt;</code>, <code>&lt;a&gt;</code>, and more, allowing developers to control various aspects of their content in a uniform manner.<br><br>" +

                                "By using global attributes effectively, developers can improve the accessibility, usability, and behavior of web pages, making them more dynamic and user-friendly."
                ));
                break;

            case "HTML Forms and Form Elements":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Forms and Form Elements</b> are used to collect user input and send data to a server for processing. Forms are essential for creating interactive web pages, allowing users to submit information such as login credentials, search queries, and contact details.<br><br>" +

                                "A basic form in HTML is created using the <b>&lt;form&gt;</b> element, which can contain various types of form controls like text fields, radio buttons, checkboxes, and buttons.<br><br>" +

                                "<b>1. The <i>&lt;form&gt;</i> Element</b>: The <code>&lt;form&gt;</code> tag is used to define the beginning and end of the form. It can include attributes like <b>action</b> (specifying the URL where the form data is sent) and <b>method</b> (specifying how the data is sent, such as 'GET' or 'POST').<br>" +
                                "Example: <code>&lt;form action='/submit' method='POST'&gt;</code><br><br>" +

                                "<b>2. Text Inputs</b>: Text inputs are created using the <b>&lt;input&gt;</b> element with the type attribute set to 'text'. This creates a single-line text field for user input.<br>" +
                                "Example: <code>&lt;input type='text' name='username' /&gt;</code><br><br>" +

                                "<b>3. Password Input</b>: The <b>&lt;input&gt;</b> element with type 'password' creates a text field that obscures the user's input, which is ideal for sensitive information like passwords.<br>" +
                                "Example: <code>&lt;input type='password' name='password' /&gt;</code><br><br>" +

                                "<b>4. Radio Buttons</b>: Radio buttons are used when only one option is allowed to be selected from a list of options. The <b>&lt;input&gt;</b> element with type 'radio' is used for this purpose.<br>" +
                                "Example: <code>&lt;input type='radio' name='gender' value='male' /&gt; Male</code><br>" +
                                "<code>&lt;input type='radio' name='gender' value='female' /&gt; Female</code><br><br>" +

                                "<b>5. Checkboxes</b>: Checkboxes allow the user to select one or more options from a list. The <b>&lt;input&gt;</b> element with type 'checkbox' is used for this purpose.<br>" +
                                "Example: <code>&lt;input type='checkbox' name='subscribe' /&gt; Subscribe to newsletter</code><br><br>" +

                                "<b>6. Drop-down Menus (Select)</b>: Drop-down menus are created using the <b>&lt;select&gt;</b> and <b>&lt;option&gt;</b> elements. The <b>&lt;select&gt;</b> element is used to create a list, and each <b>&lt;option&gt;</b> tag represents a menu item.<br>" +
                                "Example: <code>&lt;select name='country'&gt;</code><br>" +
                                "<code>&lt;option value='usa'&gt;USA&lt;/option&gt;</code><br>" +
                                "<code>&lt;option value='canada'&gt;Canada&lt;/option&gt;</code><br>" +
                                "<code>&lt;/select&gt;</code><br><br>" +

                                "<b>7. Textarea</b>: The <b>&lt;textarea&gt;</b> element is used to create a multi-line text input field. It is typically used for collecting longer pieces of text, such as a message or comment.<br>" +
                                "Example: <code>&lt;textarea name='message' rows='4' cols='50'&gt;&lt;/textarea&gt;</code><br><br>" +

                                "<b>8. Submit Button</b>: The <b>&lt;input&gt;</b> element with type 'submit' is used to create a button that submits the form to the server.<br>" +
                                "Example: <code>&lt;input type='submit' value='Submit' /&gt;</code><br><br>" +

                                "<b>9. Reset Button</b>: The <b>&lt;input&gt;</b> element with type 'reset' creates a button that resets all form fields to their default values.<br>" +
                                "Example: <code>&lt;input type='reset' value='Reset' /&gt;</code><br><br>" +

                                "<b>10. Form Attributes</b>: Additional attributes for the <code>&lt;form&gt;</code> element include <b>enctype</b> (for specifying the encoding type of the form data, often used when sending files) and <b>target</b> (for specifying where to open the response, such as '_blank' for a new tab).<br>" +
                                "Example: <code>&lt;form action='/upload' method='POST' enctype='multipart/form-data'&gt;</code><br><br>" +

                                "In addition to these basic elements, forms can also include advanced elements like file upload fields (<b>&lt;input type='file'&gt;</b>), date pickers, and hidden fields. Forms are crucial for interacting with users and are used on virtually every website.<br><br>" +

                                "When designing forms, it’s important to ensure they are user-friendly and accessible. This includes proper labeling of form elements, clear instructions for the user, and form validation to ensure correct data submission.<br><br>" +

                                "HTML forms are powerful tools for creating dynamic, interactive web applications, and understanding how to implement them properly is a key skill for any web developer."
                ));
                break;

            case "HTML Table Elements":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Table Elements</b> are used to display tabular data on a web page. Tables allow you to organize and present data in rows and columns. HTML provides a set of specific tags to create and format tables.<br><br>" +

                                "<b>1. The <i>&lt;table&gt;</i> Element</b>: The <code>&lt;table&gt;</code> tag is used to define the table itself. It is the container for all other table elements.<br>" +
                                "Example: <code>&lt;table&gt;...&lt;/table&gt;</code><br><br>" +

                                "<b>2. Table Rows (<i>&lt;tr&gt;</i>)</b>: The <code>&lt;tr&gt;</code> tag is used to define a table row. Each <code>&lt;tr&gt;</code> element contains one or more table data or header cells.<br>" +
                                "Example: <code>&lt;tr&gt;...&lt;/tr&gt;</code><br><br>" +

                                "<b>3. Table Header Cells (<i>&lt;th&gt;</i>)</b>: The <code>&lt;th&gt;</code> tag defines a table header cell. By default, header cells are bold and centered.<br>" +
                                "Example: <code>&lt;th&gt;Header&lt;/th&gt;</code><br><br>" +

                                "<b>4. Table Data Cells (<i>&lt;td&gt;</i>)</b>: The <code>&lt;td&gt;</code> tag defines a table data cell, where you place the actual content or data.<br>" +
                                "Example: <code>&lt;td&gt;Data&lt;/td&gt;</code><br><br>" +

                                "<b>5. Table Caption (<i>&lt;caption&gt;</i>)</b>: The <code>&lt;caption&gt;</code> tag is used to define a title or description for the table.<br>" +
                                "Example: <code>&lt;caption&gt;Student Grades&lt;/caption&gt;</code><br><br>" +

                                "<b>6. Table Borders and Styling</b>: Tables can be styled using CSS to control the borders, spacing, padding, and alignment of cells. For example, setting a border for the table with <code>border: 1px solid black;</code>.<br>" +
                                "Example: <code>&lt;table style='border: 1px solid black;'&gt;...&lt;/table&gt;</code><br><br>" +

                                "Tables are widely used for displaying structured data like lists, schedules, or reports, and they allow users to easily understand relationships between data points in rows and columns."
                ));
                break;

            case "HTML5 Form Attributes":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML5 Form Attributes</b> introduced new attributes to enhance form functionality, improve user experience, and increase accessibility. These attributes provide additional control over form validation, input behavior, and data submission.<br><br>" +

                                "<b>1. Autocomplete</b>: The <code>autocomplete</code> attribute allows the browser to automatically fill in values for form fields based on previously entered data. It can be set to 'on' (default) or 'off' to control auto-filling.<br>" +
                                "Example: <code>&lt;input type='text' autocomplete='on' /&gt;</code><br><br>" +

                                "<b>2. Placeholder</b>: The <code>placeholder</code> attribute provides a short hint to the user about what to enter in a text field.<br>" +
                                "Example: <code>&lt;input type='text' placeholder='Enter your name' /&gt;</code><br><br>" +

                                "<b>3. Required</b>: The <code>required</code> attribute specifies that the form field must be filled out before the form can be submitted.<br>" +
                                "Example: <code>&lt;input type='email' required /&gt;</code><br><br>" +

                                "<b>4. Pattern</b>: The <code>pattern</code> attribute is used with input fields to define a regular expression (regex) for validation. This ensures the user enters data in the correct format.<br>" +
                                "Example: <code>&lt;input type='text' pattern='[A-Za-z]{3,}' /&gt;</code><br><br>" +

                                "<b>5. Datalist</b>: The <code>datalist</code> element is used to define a list of predefined options for an <code>&lt;input&gt;</code> element. This allows the user to choose from a list of suggestions.<br>" +
                                "Example: <code>&lt;input list='browsers' /&gt;<br>" +
                                "&lt;datalist id='browsers'&gt;<br>" +
                                "&lt;option value='Chrome'&gt;<br>" +
                                "&lt;option value='Firefox'&gt;</code><br><br>" +

                                "<b>6. Input Types</b>: HTML5 introduced new input types such as 'email', 'tel', 'date', and 'range' to make forms more interactive and improve validation.<br>" +
                                "Example: <code>&lt;input type='email' /&gt;</code><br><br>" +

                                "<b>7. Number Input</b>: The <code>type='number'</code> input restricts the user to enter only numeric values and can include attributes like <code>min</code>, <code>max</code>, and <code>step</code> to set limits and increments.<br>" +
                                "Example: <code>&lt;input type='number' min='1' max='10' step='1' /&gt;</code><br><br>" +

                                "HTML5 form attributes make forms more user-friendly, improve data validation, and offer new possibilities for better form interaction."
                ));
                break;

            case "HTML Text-Level Elements":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Text-Level Elements</b> are used to define the structure, format, and presentation of text content on a webpage. These elements help apply styles, emphasize content, and organize text within a web page.<br><br>" +

                                "<b>1. The <i>&lt;strong&gt;</i> Element</b>: The <code>&lt;strong&gt;</code> element is used to indicate that text is of strong importance. It typically renders the text in bold.<br>" +
                                "Example: <code>&lt;strong&gt;Important text&lt;/strong&gt;</code><br><br>" +

                                "<b>2. The <i>&lt;em&gt;</i> Element</b>: The <code>&lt;em&gt;</code> element is used to emphasize text, which is typically rendered in italics.<br>" +
                                "Example: <code>&lt;em&gt;Emphasized text&lt;/em&gt;</code><br><br>" +

                                "<b>3. The <i>&lt;u&gt;</i> Element</b>: The <code>&lt;u&gt;</code> element represents text that should be underlined.<br>" +
                                "Example: <code>&lt;u&gt;Underlined text&lt;/u&gt;</code><br><br>" +

                                "<b>4. The <i>&lt;del&gt;</i> Element</b>: The <code>&lt;del&gt;</code> element represents deleted text, which is typically shown with a strike-through.<br>" +
                                "Example: <code>&lt;del&gt;Deleted text&lt;/del&gt;</code><br><br>" +

                                "<b>5. The <i>&lt;ins&gt;</i> Element</b>: The <code>&lt;ins&gt;</code> element represents inserted text, typically shown with an underline.<br>" +
                                "Example: <code>&lt;ins&gt;Inserted text&lt;/ins&gt;</code><br><br>" +

                                "<b>6. The <i>&lt;q&gt;</i> Element</b>: The <code>&lt;q&gt;</code> element is used to enclose short quotations. The text is typically displayed in quotation marks.<br>" +
                                "Example: <code>&lt;q&gt;This is a quote&lt;/q&gt;</code><br><br>" +

                                "<b>7. The <i>&lt;code&gt;</i> Element</b>: The <code>&lt;code&gt;</code> element is used to represent computer code, typically displayed in a monospaced font.<br>" +
                                "Example: <code>&lt;code&gt;var x = 10;&lt;/code&gt;</code><br><br>" +

                                "<b>8. The <i>&lt;samp&gt;</i> Element</b>: The <code>&lt;samp&gt;</code> element is used to define a sample output from a computer program.<br>" +
                                "Example: <code>&lt;samp&gt;Output: 42&lt;/samp&gt;</code><br><br>" +

                                "<b>9. The <i>&lt;abbr&gt;</i> Element</b>: The <code>&lt;abbr&gt;</code> element is used to define an abbreviation or acronym, often with the <code>title</code> attribute providing the full meaning.<br>" +
                                "Example: <code>&lt;abbr title='Hypertext Markup Language'&gt;HTML&lt;/abbr&gt;</code><br><br>" +

                                "<b>10. The <i>&lt;span&gt;</i> Element</b>: The <code>&lt;span&gt;</code> element is a generic inline container used for styling or scripting.<br>" +
                                "Example: <code>&lt;span style='color: red;'&gt;Red text&lt;/span&gt;</code><br><br>" +

                                "Text-level elements are crucial for styling and organizing text, helping web developers create rich, well-structured content."
                ));
                break;

            case "HTML Input Types":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Input Types</b> define the type of data that an input field can accept. HTML5 introduced several new input types to improve form usability, validation, and user interaction. Different input types display various controls, such as text fields, checkboxes, date pickers, and more.<br><br>" +

                                "<b>1. Text (<i>&lt;input type='text'&gt;</i>)</b>: The <code>text</code> input type is the most common and allows users to enter single-line text.<br>" +
                                "Example: <code>&lt;input type='text' /&gt;</code><br><br>" +

                                "<b>2. Password (<i>&lt;input type='password'&gt;</i>)</b>: The <code>password</code> input type is used to securely input sensitive data. Characters are masked as the user types.<br>" +
                                "Example: <code>&lt;input type='password' /&gt;</code><br><br>" +

                                "<b>3. Email (<i>&lt;input type='email'&gt;</i>)</b>: The <code>email</code> input type is used for entering email addresses. It enables validation of the email format.<br>" +
                                "Example: <code>&lt;input type='email' /&gt;</code><br><br>" +

                                "<b>4. Number (<i>&lt;input type='number'&gt;</i>)</b>: The <code>number</code> input type is used to accept numerical values. It allows input of integers and decimals, with optional validation for minimum and maximum values.<br>" +
                                "Example: <code>&lt;input type='number' min='1' max='100' /&gt;</code><br><br>" +

                                "<b>5. Date (<i>&lt;input type='date'&gt;</i>)</b>: The <code>date</code> input type allows users to select a date from a calendar.<br>" +
                                "Example: <code>&lt;input type='date' /&gt;</code><br><br>" +

                                "<b>6. Checkbox (<i>&lt;input type='checkbox'&gt;</i>)</b>: The <code>checkbox</code> input type is used for options that can be toggled on or off.<br>" +
                                "Example: <code>&lt;input type='checkbox' /&gt;</code><br><br>" +

                                "<b>7. Radio (<i>&lt;input type='radio'&gt;</i>)</b>: The <code>radio</code> input type allows users to select one option from a group of choices.<br>" +
                                "Example: <code>&lt;input type='radio' name='color' value='red' /&gt;</code><br><br>" +

                                "<b>8. File (<i>&lt;input type='file'&gt;</i>)</b>: The <code>file</code> input type allows users to select one or more files from their device to upload.<br>" +
                                "Example: <code>&lt;input type='file' /&gt;</code><br><br>" +

                                "These input types help enhance user experience by providing appropriate controls for different types of data entry, reducing validation errors and improving form accessibility."
                ));
                break;

            case "HTML Element Styling":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Element Styling</b> involves using CSS (Cascading Style Sheets) to change the appearance of HTML elements. Styling can be applied directly in the HTML document (inline), in a separate CSS file (external), or within the <code>&lt;style&gt;</code> tags in the document's head.<br><br>" +

                                "<b>1. Inline Styling</b>: Inline styles are added directly to HTML elements using the <code>style</code> attribute.<br>" +
                                "Example: <code>&lt;div style='color: red;'&gt;This is red text&lt;/div&gt;</code><br><br>" +

                                "<b>2. Internal Styling</b>: Internal styles are placed inside the <code>&lt;style&gt;</code> tag within the <code>&lt;head&gt;</code> of the HTML document.<br>" +
                                "Example: <code>&lt;style&gt; div { color: red; } &lt;/style&gt;</code><br><br>" +

                                "<b>3. External Styling</b>: External styles are stored in a separate CSS file and linked to the HTML document using the <code>&lt;link&gt;</code> tag.<br>" +
                                "Example: <code>&lt;link rel='stylesheet' href='styles.css' /&gt;</code><br><br>" +

                                "<b>4. CSS Selectors</b>: CSS selectors are used to target specific HTML elements that need to be styled. These can include element selectors, class selectors, and ID selectors.<br>" +
                                "Example: <code>p { color: red; }</code> (This targets all <code>&lt;p&gt;</code> elements).<br><br>" +

                                "<b>5. Box Model</b>: The box model is the structure that defines how elements are spaced, including content, padding, border, and margin. Proper understanding of the box model is essential for layout design.<br>" +
                                "Example: <code>div { padding: 10px; border: 1px solid black; margin: 5px; }</code><br><br>" +

                                "<b>6. Flexbox and Grid</b>: CSS Flexbox and Grid are advanced layout techniques that allow for responsive, flexible, and grid-based design.<br>" +
                                "Example: <code>display: flex;</code> (for Flexbox) and <code>display: grid;</code> (for Grid).<br><br>" +

                                "Styling elements in HTML is essential for creating visually appealing web pages that are both functional and user-friendly."
                ));
                break;

            case "HTML Page Metadata":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Page Metadata</b> provides information about a webpage that is not visible to users but is used by browsers, search engines, and other external services. Metadata is defined in the <code>&lt;head&gt;</code> section of an HTML document.<br><br>" +

                                "<b>1. <i>&lt;meta&gt;</i> Tags</b>: The <code>&lt;meta&gt;</code> tags provide metadata such as the document's character encoding, author, and viewport settings.<br>" +
                                "Example: <code>&lt;meta charset='UTF-8' /&gt;</code><br><br>" +

                                "<b>2. <i>&lt;title&gt;</i> Tag</b>: The <code>&lt;title&gt;</code> tag defines the title of the webpage, which is displayed in the browser tab.<br>" +
                                "Example: <code>&lt;title&gt;My Webpage&lt;/title&gt;</code><br><br>" +

                                "<b>3. <i>&lt;link&gt;</i> Tag</b>: The <code>&lt;link&gt;</code> tag is used to link external resources like stylesheets, icons, and more.<br>" +
                                "Example: <code>&lt;link rel='stylesheet' href='style.css' /&gt;</code><br><br>" +

                                "<b>4. <i>&lt;meta name='description'&gt;</i> Tag</b>: The <code>&lt;meta name='description' content='description of the page' /&gt;</code> tag provides a brief description of the page, which is often used by search engines for search results.<br>" +
                                "Example: <code>&lt;meta name='description' content='Learn HTML basics' /&gt;</code><br><br>" +

                                "<b>5. <i>&lt;meta name='keywords'&gt;</i> Tag</b>: The <code>&lt;meta name='keywords' content='HTML, tags, web development' /&gt;</code> tag allows you to specify keywords related to your content to help search engines understand the page's topic.<br>" +
                                "Example: <code>&lt;meta name='keywords' content='HTML, tags, web development' /&gt;</code><br><br>" +

                                "Proper use of metadata helps with SEO (Search Engine Optimization), accessibility, and ensures your webpage is recognized and understood by search engines and other external services."
                ));
                break;

            case "HTML Accessibility Best Practices":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Accessibility Best Practices</b> are essential for ensuring that websites are usable by people with disabilities. Following accessibility guidelines makes websites more inclusive, improving the user experience for everyone, including those with visual, auditory, cognitive, and motor impairments. Here are some best practices to follow:<br><br>" +

                                "<b>1. Use Semantic HTML</b>: Use the appropriate HTML elements for their intended purpose. For example, use <code>&lt;button&gt;</code> for clickable buttons, <code>&lt;header&gt;</code> for headers, and <code>&lt;nav&gt;</code> for navigation. This helps screen readers and other assistive technologies understand the content structure.<br><br>" +

                                "<b>2. Provide Text Alternatives</b>: Always include <code>alt</code> text for images (<code>&lt;img alt='description' /&gt;</code>) and other non-text content. This enables screen readers to describe the content to visually impaired users.<br><br>" +

                                "<b>3. Use ARIA Roles and Properties</b>: ARIA (Accessible Rich Internet Applications) provides roles and properties to enhance accessibility. These attributes help assistive technologies understand complex user interface elements.<br>" +
                                "Example: <code>&lt;div role='alert' aria-live='assertive'&gt;Error message&lt;/div&gt;</code><br><br>" +

                                "<b>4. Ensure Keyboard Accessibility</b>: Ensure that all interactive elements (like buttons and links) are navigable and usable with the keyboard alone. Use proper <code>tabindex</code> attributes to define the tab order.<br><br>" +

                                "<b>5. Provide Sufficient Color Contrast</b>: Ensure there is enough contrast between text and background colors. This is essential for users with low vision or color blindness.<br>" +
                                "Example: <code>color: #000000; background-color: #FFFFFF;</code><br><br>" +

                                "<b>6. Use Forms Correctly</b>: Label form inputs properly with the <code>&lt;label&gt;</code> tag, and associate labels with form fields using the <code>for</code> attribute. This improves navigation and understanding for screen reader users.<br>" +
                                "Example: <code>&lt;label for='email'&gt;Email Address&lt;/label&gt; <input type='email' id='email' /&gt;</code><br><br>" +

                                "By adhering to accessibility best practices, websites can become more inclusive, improving usability for people with disabilities while also enhancing SEO and general user experience."
                ));
                break;

            case "HTML Best Practices and Optimization":
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>HTML Best Practices and Optimization</b> are techniques and strategies aimed at improving the performance, maintainability, and usability of HTML code. By following these best practices, developers can ensure their web pages load faster, are more accessible, and are easier to maintain.<br><br>" +

                                "<b>1. Write Clean and Semantic Code</b>: Use descriptive, semantic HTML tags that convey meaning. This helps both humans and search engines understand the content of your webpage. Avoid using generic <code>&lt;div&gt;</code> or <code>&lt;span&gt;</code> tags where semantic tags like <code>&lt;article&gt;</code>, <code>&lt;header&gt;</code>, and <code>&lt;footer&gt;</code> are more appropriate.<br><br>" +

                                "<b>2. Minimize HTML File Size</b>: Keep your HTML files as small as possible by removing unnecessary whitespace, comments, and unused code. This helps reduce page load times and enhances performance.<br><br>" +

                                "<b>3. Optimize Images</b>: Use image formats that provide the best balance between quality and file size. Use image compression tools to reduce file sizes and consider using responsive images (with <code>&lt;picture&gt;</code> and <code>&lt;srcset&gt;</code>) to adapt images to different screen sizes.<br>" +
                                "Example: <code>&lt;img src='image.jpg' srcset='image-500w.jpg 500w, image-1000w.jpg 1000w' /&gt;</code><br><br>" +

                                "<b>4. Use External CSS and JavaScript</b>: Separate your CSS and JavaScript code into external files. This reduces the size of the HTML file, allows caching of these resources, and makes the code easier to maintain.<br>" +
                                "Example: <code>&lt;link rel='stylesheet' href='styles.css' /&gt;</code><br><br>" +

                                "<b>5. Enable Caching</b>: Implement browser caching by setting appropriate HTTP headers or using <code>manifest</code> files for offline access. This helps improve page load speeds for returning visitors.<br><br>" +

                                "<b>6. Avoid Inline JavaScript and CSS</b>: Avoid embedding JavaScript and CSS directly within HTML files. This can lead to cluttered code and can slow down page rendering. Instead, link to external files.<br><br>" +

                                "<b>7. Use Proper HTML Structure</b>: Organize your HTML documents properly with a clear hierarchy, and always include the necessary <code>&lt;head&gt;</code> and <code>&lt;body&gt;</code> sections. Ensure each page has a unique <code>&lt;title&gt;</code> and <code>&lt;meta&gt;</code> tags for better SEO.<br><br>" +

                                "<b>8. Test and Validate Code</b>: Regularly test your HTML for errors and validate it using tools like the W3C Markup Validation Service. Fixing errors early can help prevent rendering issues and improve accessibility.<br><br>" +

                                "Following these best practices can enhance your website's performance, maintainability, and SEO ranking while improving the overall user experience."
                ));
                break;





            default:
                topicInfo.setText(android.text.Html.fromHtml(
                        "<b>No information available for this topic.</b><br>" +
                                "It seems the topic you are looking for is either not available or hasn't been defined yet. " +
                                "Please check back later or explore other available topics for more information."
                ));
                break;
        }




    }

}