import streamlit as st

# Set page title and layout
st.set_page_config(page_title="DevOps Calculator", layout="centered")

# Title
st.title("🚀 DevOps CI/CD Pipeline Demo")
st.markdown("---")

# Calculator heading
st.header("📊 Interactive Calculator")

# Create two columns for input
col1, col2 = st.columns(2)

with col1:
    # First number input
    num1 = st.number_input("Enter first number", value=10, step=1)

with col2:
    # Second number input
    num2 = st.number_input("Enter second number", value=5, step=1)

st.markdown("---")

# Create buttons for operations
st.subheader("Select Operation:")

# Four buttons in a row
button_col1, button_col2, button_col3, button_col4 = st.columns(4)

with button_col1:
    if st.button("➕ Add", use_container_width=True):
        result = num1 + num2
        st.success(f"✅ {num1} + {num2} = {result}")

with button_col2:
    if st.button("➖ Subtract", use_container_width=True):
        result = num1 - num2
        st.success(f"✅ {num1} - {num2} = {result}")

with button_col3:
    if st.button("✖️ Multiply", use_container_width=True):
        result = num1 * num2
        st.success(f"✅ {num1} × {num2} = {result}")

with button_col4:
    if st.button("➗ Divide", use_container_width=True):
        if num2 != 0:
            result = num1 / num2
            st.success(f"✅ {num1} ÷ {num2} = {result}")
        else:
            st.error("❌ Cannot divide by zero!")

st.markdown("---")
st.caption("Powered by Streamlit | CI/CD Pipeline Demo")